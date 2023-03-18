package org.chiskien;

import org.chiskien.sorting.SelectionSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String DATA = "src/main/resources/data.txt";

    public static void main(String[] args) throws IOException {
        var data = getDataFromFile(DATA);
        System.out.println(data);
        SelectionSort selectionSort = SelectionSort.getInstance();
        System.out.println("The index has the smallest value is:" + selectionSort.findSmallestItem(data));
        System.out.println("Selection sort: " + selectionSort.selectionSort(data));
    }

    private static List<Integer> getDataFromFile(String uri) throws IOException {
        Path path = Paths.get(uri);
        List<String> lines = Files.readAllLines(path);
        String[] items = new String[0];
        for (String line : lines) {
            items = line.split(",");
        }
        List<Integer> listInteger = new ArrayList<>(items.length);
        for (int i = 0; i < items.length; i++) {
            listInteger.add(Integer.parseInt(items[i]));
        }
        return listInteger;
    }

    private static void writeToFile(String uri, List<Integer> data) {
        
    }

    private static void generateRandomArray(int arraySize, int min, int max, String regex) {

    }
}