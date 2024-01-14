package chiskien.effectivejava.chapter1_objectslifecycle.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourcePreferable {
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        }
    }
}
