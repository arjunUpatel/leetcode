public class NextPermutation {
	public void nextPermutation(int[] nums) {

		int ptr1 = nums.length - 1, ptr2 = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[ptr1]) {
				ptr2 = ptr1;
				ptr1 = i;
				break;
			}
		}
		if (ptr2 != -1)
			swap(nums, ptr1, ptr2);
		else {
			for (int i = 0; i < nums.length / 2; i++)
				swap(nums, i, nums.length - 1 - i);
			return;
		}
		ptr1 = nums.length - 1;
		ptr2 = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] > nums[ptr1]) {
				swap(nums, i, ptr1);
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}