package chiskien.datastructures_algorithms.leetcode.linked_list;

public class SplitLinkedListintoParts {

    public static void main(String[] args) {

        ListNode head = ListNode.build(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        splitlistintoParts(head, 4);
    }

    public static ListNode[] splitlistintoParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int size = 0;
        ListNode h = head;
        while (h != null) {
            ++size;
            h = h.next;
        }
        int div = size / k;
        ListNode current = head;
        ListNode previous;
        for (int i = 0; i < k; i++) {
            if (current.next != null) {
                if (i == div) {
                    ListNode temp = current.next;
                    current.next = null;
                    previous = temp;
                    current = previous;
                    i = 0;
                } else {
                    current = current.next;
                }
            } else {
            }
        }

        return result;
    }

    //solution
    public ListNode[] get(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];

        // Calculate the length of the linked list.
        int len = 0;
        ListNode node = root;
        while (node != null) {
            len++;
            node = node.next;
        }

        // Calculate the minimum guaranteed part size (n) and the number of extra nodes (r).
        int n = len / k, r = len % k;

        // Reset the pointer to the beginning of the linked list.
        node = root;
        ListNode prev = null;

        // Loop through each part.
        for (int i = 0; node != null && i < k; i++, r--) {
            // Store the current node as the start of the current part.
            parts[i] = node;

            // Traverse n + 1 nodes if there are remaining extra nodes (r > 0).
            // Otherwise, traverse only n nodes.
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }

            // Disconnect the current part from the rest of the list by setting prev.next to null.
            if (prev != null) {
                prev.next = null;
            }
        }

        // Return the array of k parts.
        return parts;
    }
}
