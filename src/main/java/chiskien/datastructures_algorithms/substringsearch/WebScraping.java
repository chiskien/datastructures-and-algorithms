package chiskien.datastructures_algorithms.substringsearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WebScraping {
    public static void main(String[] args) throws IOException {
        webscrape(args[0]);
    }

    //Simple web scraping
    public static void webscrape(String uri) throws IOException {
        Path p = Paths.get(uri);
        String text = Files.readString(p);

    }
}
