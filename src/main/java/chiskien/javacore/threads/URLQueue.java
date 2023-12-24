package chiskien.javacore.threads;

import java.util.Deque;
import java.util.LinkedList;

public class URLQueue {

    public Deque<String> urlQueue = new LinkedList<>();

    public synchronized void addQueue(String url) {
        urlQueue.add(url);
    }

    public synchronized String getUrl() {
        if (urlQueue.isEmpty()) {
            return null;
        }
        return urlQueue.removeFirst();
    }
}
