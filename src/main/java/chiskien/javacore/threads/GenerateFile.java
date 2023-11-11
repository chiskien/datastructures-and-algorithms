package chiskien.javacore.threads;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateFile implements Runnable {

    public static final String PATH = "D:/test/";
    public String name;

    @Override
    public void run() {
        Path p = Paths.get(PATH);
    }
}
