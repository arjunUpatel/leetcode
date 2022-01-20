var findMaxConsecutiveOnes = function (nums) {
	let res = 0;
	let temp = 0;
	for (let i = 0; i < nums.length; i++) {
		if (nums[i] != 1)
			res = temp > res ? temp : res;
		temp++;
	}
	return res;
};
