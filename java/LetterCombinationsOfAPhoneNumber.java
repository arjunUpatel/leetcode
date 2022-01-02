import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		HashMap<Integer, String> numberLetterCombination = new HashMap<>();
		numberLetterCombination.put(2, "abc");
		numberLetterCombination.put(3, "def");
		numberLetterCombination.put(4, "ghi");
		numberLetterCombination.put(5, "jkl");
		numberLetterCombination.put(6, "mno");
		numberLetterCombination.put(7, "pqrs");
		numberLetterCombination.put(8, "tuv");
		numberLetterCombination.put(9, "wxyz");
		queue.add("");
		for (int i = 0; i < digits.length(); i++) {
			String associatedStr = numberLetterCombination.get(Integer.parseInt(digits.substring(i, i + 1)));
			while (queue.peek().length() == i) {
				String str = queue.poll();
				for (int j = 0; j < associatedStr.length(); j++)
					queue.add(str + associatedStr.charAt(j));
			}
		}
		while (!queue.isEmpty() && !queue.peek().equals(""))
			result.add(queue.poll());
		return result;
	}
}