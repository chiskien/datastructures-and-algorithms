package chiskien.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream inputStream;
        try {
            inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/main/resources/result.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
