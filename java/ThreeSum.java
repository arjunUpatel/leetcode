import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int target = -nums[i], lo = i + 1, hi = nums.length - 1;
			while (lo < hi) {
				int sum = nums[lo] + nums[hi];
				if (sum == target) {
					result.add(Arrays.asList(-target, nums[lo++], nums[hi--]));
					while (lo < hi && nums[lo] == nums[lo - 1])
						lo++;
					while (lo < hi && nums[hi] == nums[hi + 1])
						hi--;
				} else if (sum > target)
					hi--;
				else
					lo++;
			}
		}
		return result;
	}
}
