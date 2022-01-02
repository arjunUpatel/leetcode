import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		Queue<String> temp = new LinkedList<>();
		HashMap<Integer, String> numberLetterCombination = new HashMap<>();

		numberLetterCombination.put(2, "abc");
		numberLetterCombination.put(3, "def");
		numberLetterCombination.put(4, "ghi");
		numberLetterCombination.put(5, "jkl");
		numberLetterCombination.put(6, "mno");
		numberLetterCombination.put(7, "pqrs");
		numberLetterCombination.put(8, "tuv");
		numberLetterCombination.put(9, "wxyz");
		return result;

		// []
		// [a b c]
		// [d e f]
		// [g h i]

		// stack (
		// 	a,def -> ad,ghi
		// 	b,def
		// 	c,def
		// )
	}
	public Queue<String> addLetter(String str, String digits, Queue<String> queue, HashMap<Integer, String> numberLetterCombination){
		if(digits.length() == 0)
			return queue;
		String associatedLetters = numberLetterCombination.get(Integer.parseInt(digits.substring(0, 1)));
		queue.add();
	}
}