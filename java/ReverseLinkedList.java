public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, temp = null;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
    }
}
