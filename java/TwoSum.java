import java.util.HashMap;

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			int complement = target - key;
			if (map.containsKey(complement))
				return new int[] { map.get(complement), i };
			if (!map.containsKey(key))
				map.put(key, i);
		}
		return new int[] {};
	}
}