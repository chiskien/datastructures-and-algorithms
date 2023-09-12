package org.chiskien.leetcode.stack;

import org.chiskien.datastructures.leetcode.stack.MinifiedPath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MinifiedPathTest {
    MinifiedPath minifiedPath;

    @BeforeEach
    void setUp() {
        minifiedPath = new MinifiedPath();
    }

    @Test
    void simplifyPath() {
        String path = "/home/";
        String result = minifiedPath.simplifyPath(path);
        assertEquals(result, "/home");
    }

    @Test
    void simplifyPath2() {
        String path = "/../";
        String result = minifiedPath.simplifyPath(path);
        assertEquals(result, "/");
    }

    @Test
    void simplifyPath3() {
        String path = "/home//foo/";
        String result = minifiedPath.simplifyPath(path);
        assertEquals(result, "/home/foo");
    }

    @Test
    void simplifyPath4() {
        String path = "/../home/";
        String result = minifiedPath.simplifyPath(path);
        assertEquals(result, "/home");
    }

    @Test
    void simplifyPath5() {
        String path = "/../../.././go/home////dog/go//aaa/./aaaaaaaa/";
        String result = minifiedPath.simplifyPath(path);
        assertNotEquals("/home", result);
    }

    @Test
    void simplifyPath6() {
        String path = "./home";
        String result = minifiedPath.simplifyPath(path);
        assertNotEquals("/home", result);
    }
}