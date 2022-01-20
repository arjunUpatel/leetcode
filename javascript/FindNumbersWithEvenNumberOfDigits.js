var findNumbers = function (nums) {
	let res = 0;
	for (let i = 0; i < nums.length; i++) {
		let num = "" + nums[i];
		res = num.length % 2 == 0 ? res + 1 : res;
	}
	return res;
};
