public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode res;
		if (list1 != null) {
			try {
				if (list1.val < list2.val) {
					res = list1;
					list1 = list1.next;
				} else {
					res = list2;
					list2 = list2.next;
				}
			} catch (Exception e) {
				res = list1;
				list1 = list1.next;
			}
		} else if (list2 != null) {
			res = list2;
			list2 = list2.next;
		} else
			return null;
		ListNode head = res;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				res.next = new ListNode(list1.val, null);
				res = res.next;
				list1 = list1.next;
			}
			else {
				res.next = new ListNode(list2.val, null);
				res = res.next;
				list2 = list2.next;
			}
		}
		while (list1 != null) {
			res.next = new ListNode(list1.val, null);
			list1 = list1.next;
			res = res.next;
		}
		while (list2 != null) {
			res.next = new ListNode(list2.val, null);
			list2 = list2.next;
			res = res.next;
		}
		return head;
	}

	public class ListNode {
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