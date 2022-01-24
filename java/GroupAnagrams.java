import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> res = new ArrayList<>();
		for (int i = 0; i < strs.length; i++) {
			char[] arr = strs[i].toCharArray();
			Arrays.sort(arr);
			String str = "";
			for (int j = 0; j < arr.length; j++)
				str += arr[j];
			if (!map.containsKey(str))
				map.put(str, new ArrayList<>());
			map.get(str).add(strs[i]);

		}
		for (List val : map.values())
			res.add(val);
		return res;
	}
}