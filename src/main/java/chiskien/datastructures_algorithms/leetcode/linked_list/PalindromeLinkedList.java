package chiskien.datastructures_algorithms.leetcode.linked_list;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        //test the reverse of second half to first half
        // if equal then is palindrome

        //Reuse the reverse linked-list class
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        if (head == null) return true;
        //finding the head of second half = slow
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //Compare first half and the reversed second half lists
        ListNode secondHalf = reverseLinkedList.reverseList(slow);
        System.out.println(secondHalf);
        ListNode firstHalf = head;
        while (secondHalf != null && firstHalf != null) {
            if (secondHalf.val != firstHalf.val) {
                return false;
            } else {
                secondHalf = secondHalf.next;
                firstHalf = firstHalf.next;
            }
        }
        return true;
    }
}
