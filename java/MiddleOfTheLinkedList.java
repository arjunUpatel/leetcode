public class MiddleOfTheLinkedList {
    int mid, length;
    ListNode res = null;

    public ListNode middleNode(ListNode head) {
        middleNode(head, 0);
        return res;
    }

    public void middleNode(ListNode node, int count) {
        if (node == null) {
            mid = count / 2;
            return;
        }
        middleNode(node.next, count + 1);
        if (count == mid)
            res = node;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
    }
}
