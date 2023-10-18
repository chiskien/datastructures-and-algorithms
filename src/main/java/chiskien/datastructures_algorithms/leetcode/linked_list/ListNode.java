package chiskien.datastructures_algorithms.leetcode.linked_list;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode build(int[] nodes) {
        if (nodes.length == 0) return null;
        ListNode head = new ListNode(nodes[0]);
        ListNode n = head;
        for (int i = 1; i < nodes.length; i++) {
            head.next = new ListNode(nodes[i]);
            head = head.next;
        }
        return n;
    }

    public static int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static ListNode advanceListByK(ListNode head, int k) {
        ListNode dummy = head;
        while (k-- > 0) {
            dummy = dummy.next;
        }
        return dummy;
    }

    public static List<ListNode> traverse(ListNode head) {
        ListNode n = head;
        List<ListNode> list = new ArrayList<>();
        while (n != null) {
            list.add(n);
            n = n.next;
        }
        return list;
    }

    public static int distance(ListNode a, ListNode b) {
        int distance = 0;
        ListNode temp = a;
        while (temp != b) {
            temp = temp.next;
            distance++;
        }
        return distance;
    }

    public static void deleteNode(ListNode nodeTobeDeleted) {
        nodeTobeDeleted.val = nodeTobeDeleted.next.val;
        nodeTobeDeleted.next = nodeTobeDeleted.next.next;
    }

    @Override
    public String toString() {
        return "[val= " + val + ", next= " + next + "]";
    }
}
