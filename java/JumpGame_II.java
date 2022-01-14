public class JumpGame_II {
	public int jump(int[] nums) {
		if (nums.length == 1)
			return 0;
		int i = 0, count = 0;
		while (nums[i] + i < nums.length - 1) {
			count++;
			int maxRangeIndex = i + 1;
			for (int j = i + 2; j <= nums[i] + i; j++) {
				if (j + nums[j] > nums[maxRangeIndex] + maxRangeIndex) {
					maxRangeIndex = j;
				}
			}
			i = maxRangeIndex;
		}
		count++;
		return count;
	}
}
