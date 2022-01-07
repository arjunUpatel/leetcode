public class NextPermutation {
	public void nextPermutation(int[] nums) {

		int ptr1 = -1, ptr2 = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				ptr1 = i;
				break;
			}
		}
		if (ptr1 == -1) {
			reverse(nums, 0);
			return;
		} else {
			ptr2 = ptr1 + 1;
			for (int i = ptr1 + 1; i < nums.length; i++) {
				if (nums[i] > nums[ptr1] && nums[i] <= nums[ptr2])
					ptr2 = i;
			}
			swap(nums, ptr1, ptr2);
			reverse(nums, ptr1 + 1);
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void reverse(int[] nums, int start) {
		for (int i = start; i < (start + nums.length) / 2; i++) {
			swap(nums, i, nums.length - i + start - 1);
		}
	}
}