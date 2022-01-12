import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		int i = 0;
		while (i < candidates.length && candidates[i] <= target) {
			List<Integer> combo = new ArrayList<>();
			combo.add(candidates[i]);
			backtrack(candidates, candidates[i], combo, target);
			i++;
		}
		return res;
	}

	public void backtrack(int[] candidates, int currSum, List<Integer> combo, int target) {
		if (currSum == target) {
			Collections.sort(combo);
			if (!res.contains(combo))
				res.add(combo);
			return;
		} else {
			int i = 0;
			while (i < candidates.length && candidates[i] <= (target - currSum)) {
				List<Integer> temp = new ArrayList<>(combo);
				temp.add(candidates[i]);
				backtrack(candidates, currSum + candidates[i], temp, target);
				i++;
			}
		}
	}
}
