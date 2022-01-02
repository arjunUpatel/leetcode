import java.util.Stack;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		Stack<ListNode> stack = new Stack<>();
		for (ListNode node = head; node != null; node = node.next)
			stack.add(node);
		for (int i = 0; i < n; i++)
			stack.pop();
		if (stack.isEmpty())
			return head = head.next;
		ListNode node = stack.pop();
		node.next = node.next.next;
		return head;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}