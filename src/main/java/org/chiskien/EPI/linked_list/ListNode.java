package org.chiskien.EPI.linked_list;

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

    public ListNode build(int[] nodes) {
        ListNode head = new ListNode(nodes[0]);
        ListNode n = head;
        for (int i = 1; i < nodes.length; i++) {
            head.next = new ListNode(nodes[i]);
            head = head.next;
        }
        return n;
    }

    public List<ListNode> traverse(ListNode head) {
        ListNode n = head;
        List<ListNode> list = new ArrayList<>();
        while (n != null) {
            list.add(n);
            n = n.next;
        }
        return list;
    }

    @Override
    public String toString() {
        return "[val= " + val + ", next= " + next + "]";
    }
}
