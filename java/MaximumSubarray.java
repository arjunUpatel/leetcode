class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int front = 0, end = 1, sum = nums[0], maxSum = sum, previousSum;
		while (front < end && end < nums.length) {
			previousSum = sum;
			sum += nums[end];
			if (sum < sum - nums[front]) {
				sum -= nums[front];
				front++;
			}
			if (previousSum <= 0) {
				sum = nums[end];
				front = end;
			}
			maxSum = sum > maxSum ? sum : maxSum;
			end++;
		}
		return maxSum;
	}
}