package chiskien.javacore.threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadWebServer {

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
