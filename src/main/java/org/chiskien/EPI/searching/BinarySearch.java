package org.chiskien.EPI.searching;

public class BinarySearch {

    private volatile static BinarySearch instance;

    private BinarySearch() {

    }

    public static BinarySearch getInstance() {
        if (instance == null) {
            synchronized (BinarySearch.class) {
                if (instance == null) {
                    instance = new BinarySearch();
                }
            }
        }
        return instance;
    }

}
