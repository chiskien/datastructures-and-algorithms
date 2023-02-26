package org.chiskien;

import org.chiskien.sorting.SelectionSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String DATA = "src/main/java/org/chiskien/data.txt";

    public static void main(String[] args) throws IOException {
        var arrayData = getDataFromFile(DATA);
        System.out.println(Arrays.toString(arrayData));
        SelectionSort selectionSort = SelectionSort.getInstance();
        System.out.println(selectionSort.findSmallestItem(arrayData));
    }

    private static int[] getDataFromFile(String uri) throws IOException {
        Path path = Paths.get(uri);
        List<String> lines = Files.readAllLines(path);
        String[] items = new String[0];
        for (String line : lines) {
            items = line.split(",");
        }
        int[] arrayInput = new int[items.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arrayInput[i] = Integer.parseInt(items[i]);
        }
        return arrayInput;
    }

    private static void generateRandomArray(int arraySize, int min, int max, String regex) {

    }
}