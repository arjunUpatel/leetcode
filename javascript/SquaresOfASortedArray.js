var sortedSquares = function (nums) {
	for (let i = 0; i < nums.length; i++)
		nums[i] = nums[i] * nums[i]
	nums.sort((a, b) => { return a - b })
	return nums;
}
