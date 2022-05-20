public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode tortoise = head, hare = head.next;
        while (hare != null && hare.next != null) {
            if (tortoise == hare)
                return true;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return false;
    }

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
    }
}
