class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode ptr1 = list1, ptr2 = list2, res = null, temp = null, node = null;
		while (ptr1 != null && ptr2 != null) {
			if (ptr1.val < ptr2.val) {
				temp = ptr1;
				ptr1 = ptr1.next;
			} else {
				temp = ptr2;
				ptr2 = ptr2.next;
			}
			if (node == null) {
				node = temp;
				res = node;
			} else {
				node.next = temp;
				node = temp;
			}
		}
		if (ptr1 == null)
			node.next = ptr2;
		else
			node.next = ptr1;
		return res;
	}

	class ListNode {
		int val;
		ListNode next;
	}
}