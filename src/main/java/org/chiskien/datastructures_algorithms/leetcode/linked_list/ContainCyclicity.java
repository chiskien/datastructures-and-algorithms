package org.chiskien.datastructures_algorithms.leetcode.linked_list;

public class ContainCyclicity {
    //take a head of a single linked list and return null if does not have cycle
    // or return node is the start of the cycle.


    //solution 1: using hashtable: if space is not preferred
    // space complexity: O(n): n is the number of nodes


    //solution 2: using two pointers: fast pointer and slow pointer
    // a fast pointer advances two nodes each passes
    // a slow pointer advances one node each pass
    // if fast meets slow => there is a cycle inside the list.
    public ListNode hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            //detect a cycle
            if (slow == fast) {
                //find the length of cycle
                int cycleLength = 0;
                do {
                    ++cycleLength;
                    fast = fast.next;
                } while (slow != fast);

                //Find the head of the cycle
                ListNode cycleListAdvancedPointer = head;
                while (cycleLength-- > 0) {
                    cycleListAdvancedPointer = cycleListAdvancedPointer.next;
                }

                ListNode nodeIter = head;
                while (nodeIter != cycleListAdvancedPointer) {
                    nodeIter = nodeIter.next;
                    cycleListAdvancedPointer = cycleListAdvancedPointer.next;
                }
                return nodeIter;
            }
        }
        return null;
    }
}
