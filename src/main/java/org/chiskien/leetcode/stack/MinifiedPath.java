package org.chiskien.leetcode.stack;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MinifiedPath {
    public String simplifyPath(String path) {
        if (path.equals("")) {
            throw new IllegalArgumentException("Empty String is not a legal path");
        }
        Deque<String> stack = new LinkedList<>();
        if (path.startsWith("/")) {
            stack.push("/");
        }
        for (String token : path.split("/")) {
            if (token.equals("..")) {
                if (stack.isEmpty() || stack.peek().equals("..")) {
                    stack.push(token);
                } else {
                    if (stack.peek().equals("/")) {
                        throw new IllegalArgumentException(
                                "Path error, trying to go up to root: " + path);
                    }
                    stack.pop();
                }
            } else if (!token.equals(".") && !token.isEmpty()) {
                stack.push(token);
            }
        }
        StringBuilder result = new StringBuilder();
        if (!stack.isEmpty()) {
            Iterator<String> iter = stack.descendingIterator();
            String prev = iter.next();
            result.append(prev);
            while (iter.hasNext()) {
                if (!prev.equals("/")) {
                    result.append("/");
                }
                prev = iter.next();
                result.append(prev);
            }
        }
        return result.toString();
    }
}
