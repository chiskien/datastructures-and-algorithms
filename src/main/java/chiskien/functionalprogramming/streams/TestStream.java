package chiskien.functionalprogramming.streams;

import java.util.List;

public class TestStream {

    public List<String> books;

    public void init() {
        books = List.of("Atomic Habits", "Dune");
    }

    public List<String> listOfBookStartWithA() {
        return books.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .toList();
    }

    public List<Integer> getLength() {
        return books.stream()
                .map(s -> s.length())
                .toList();
    }

    public List<Integer> getPeekBooks() {
        return books.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .peek(System.out::println)
                .map(String::length)
                .toList();
    }

    public List<String> reduce() {
        return books.stream().toList();
    }

    public static void main(String[] args) {
        TestStream stream = new TestStream();

        stream.init();

        System.out.println(stream.listOfBookStartWithA());
        System.out.println(stream.getLength());
    }
}
