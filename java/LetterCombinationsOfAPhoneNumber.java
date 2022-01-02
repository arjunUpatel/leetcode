import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

public class LetterCombinationsOfAPhoneNumber {
	List<String> result = new ArrayList<>();
	Queue<String> queue = new LinkedList<>();
	HashMap<Integer, String> numberLetterCombination = new HashMap<>();

	public List<String> letterCombinations(String digits) {
		numberLetterCombination.put(2, "abc");
		numberLetterCombination.put(3, "def");
		numberLetterCombination.put(4, "ghi");
		numberLetterCombination.put(5, "jkl");
		numberLetterCombination.put(6, "mno");
		numberLetterCombination.put(7, "pqrs");
		numberLetterCombination.put(8, "tuv");
		numberLetterCombination.put(9, "wxyz");
		addCombinations(digits);
		while (!queue.isEmpty())
			result.add(queue.poll());
		return result;
	}

	public void addCombinations(String digits) {
		String currentCombination = queue.peek() == null ? "" : queue.poll();
		int digitPtr = currentCombination.length();
		String associatedStr = numberLetterCombination.get(Integer.parseInt(digits.substring(0, 1)));
		while (currentCombination.length() == digitPtr) {
			for (int i = 0; i < associatedStr.length(); i++)
				queue.add(currentCombination + associatedStr.charAt(i));
			for (String s : queue) {
				System.out.print(s.toString() + " ");
			}
			System.out.println();
			currentCombination = queue.poll();
			System.out.println(digitPtr);
			System.out.println(currentCombination.length());
		}
		if (currentCombination.length() < digits.length())
			addCombinations(digits);
	}
}