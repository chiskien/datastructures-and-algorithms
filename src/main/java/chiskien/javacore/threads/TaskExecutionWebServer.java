package chiskien.javacore.threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TaskExecutionWebServer {

    private static final int NUMBER_OF_THREADS = 100;
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(100);

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("The server with port: " + serverSocket.getLocalPort() + " is open");
            while (true) {
                final Socket connection = serverSocket.accept();

                Runnable task = () -> {
                    if (connection.isConnected()) {
                        System.out.println("Hello Worlds");
                        System.out.println(connection.getPort() + " ");
                    }
                };
                Callable<String> callable = () -> {
                    if (connection.isConnected()) {
                        System.out.println("Multithreaded");
                    }
                    return "Callable";
                };
                EXECUTOR.execute(task);
                Future<String> future = EXECUTOR.submit(callable);
                System.out.println(future.get(5000, TimeUnit.MILLISECONDS));
                EXECUTOR.shutdown();
                if (EXECUTOR.isShutdown()) {
                    return;
                }
            }
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}

class SingleThreadWebServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                Socket connection = serverSocket.accept();
                if (connection.isConnected()) {
                    System.out.println("Hello");
                    return;
                } else {
                    System.out.println("Bum");
                }
            }
        }
    }
}
