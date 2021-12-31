class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int i = 1;
		int index = 0;
		while (i < nums.length - index || index < nums.length - 2) {
			if (nums[index] + nums[index + i] == target) {
				result[0] = index;
				result[1] = index + i;
				return result;
			}
			i++;
			if (i + index == nums.length) {
				index++;
				i = 1;
			}
		}
		return result;
	}
}