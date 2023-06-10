package org.chiskien.EPI.linked_list;

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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
