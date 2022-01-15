import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, new ArrayList<Integer>(), nums);
		return res;
	}

	public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
		if (temp.size() == nums.length) {
			list.add(new ArrayList<Integer>(temp));
			return;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (temp.contains(nums[i]))
					continue;
				temp.add(nums[i]);
				backtrack(list, temp, nums);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
