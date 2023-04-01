package org.chiskien;

import org.chiskien.sorting.InsertionSort;
import org.chiskien.sorting.QuickSort;
import org.chiskien.sorting.SelectionSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String DATA = "src/main/resources/data.txt";

    public static void main(String[] args) throws IOException {
        var data = getDataFromFile();
        SelectionSort selectionSort = SelectionSort.getInstance();
        InsertionSort insertionSort = InsertionSort.getInstance();
        QuickSort quickSort = QuickSort.getInstance();
    }

    private static int[] getDataFromFile() throws IOException {
        Path path = Paths.get(Main.DATA);
        List<String> lines = Files.readAllLines(path);
        String[] items = new String[0];
        for (String line : lines) {
            items = line.split(",");
        }
        int[] array = new int[items.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(items[i]);
        }
        return array;
    }

    private static void writeToFile(String uri, List<Integer> data) {

    }

    private static void generateRandomArray(int arraySize, int min, int max, String regex) {

    }
}