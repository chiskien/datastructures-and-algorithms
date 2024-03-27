package chiskien.javacore.ocp.chapter5_array_collections;

import java.util.*;

class Misc {


    private void ocp17_5_6() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("snowball");
        deque.offer("minnie");
        deque.offer("sugar");
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(deque.peek() + " " + deque.peek() + " " + deque.size());
    }

    /**
     * You are running a library. Patrons select books by name. They get at the back of the checkout line. When they get to the front, they scan the book's ISBN, a unique identification number. The checkout system finds the book based on this number and marks the book as checked out. Of these choices, which data structures best represent the line to check out the book and the book lookup to mark it as checked out, respectively?
     * ArrayList, HashSet
     * ArrayList, TreeMap
     * ArrayList, TreeSet
     * LinkedList, HashSet
     * LinkedList, TreeMap
     * LinkedList, TreeSet
     */
    private void ocp17_5_7() {
        List<String> checkoutLine = new LinkedList<>();
        checkoutLine.add("C1");
        checkoutLine.add("C2");
        TreeMap<String, Boolean> checkoutBook = new TreeMap<>();

        for (String s : checkoutLine) {
            boolean isCheckout = true;
            checkoutBook.put(s, isCheckout);
        }
        System.out.println(checkoutBook);
    }

    private void ocp17_5_12(String x, String y) {
        List<String> coll = Arrays.asList(x, y);
        Collections.sort(coll);


    }

    private void ocp_5_14() {
        var list = new ArrayList<Integer>();
        list.add(56);
        list.add(56);
        list.add(3);

        var treeSet = new TreeSet<>(list);
        System.out.println(treeSet.size());
        System.out.println(treeSet.iterator().next());
    }
}
