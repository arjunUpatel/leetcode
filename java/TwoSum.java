import java.util.HashMap;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			int complement = target - key;
			if (map.containsKey(complement)) {
				res[0] = map.get(complement);
				res[1] = i;
				return res;
			}
			if (!map.containsKey(key))
				map.put(key, i);
		}
		return res;
	}
}