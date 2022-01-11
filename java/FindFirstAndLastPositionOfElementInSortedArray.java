public class FindFirstAndLastPositionOfElementInSortedArray {
	public int[] searchRange(int[] nums, int target) {
		int[] res = new int[2];
		if (nums.length == 0) {
			res[0] = -1;
			res[1] = -1;
			return res;
		}
		int lo = 0, hi = nums.length - 1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] >= target)
				hi = mid;
			else if (nums[mid] < target)
				lo = mid + 1;
		}
		res[0] = lo;
		lo = 0;
		hi = nums.length - 1;
		while (lo < hi) {
			int mid = 1 + lo + (hi - lo) / 2;
			if (nums[mid] <= target)
				lo = mid;
			else if (nums[mid] > target)
				hi = mid - 1;
		}
		res[1] = hi;
		if (res[0] > res[1] || nums[res[0]] != target) {
			res[0] = -1;
			res[1] = -1;
		}
		return res;
	}
}
