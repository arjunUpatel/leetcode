import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
	List<String> res = new ArrayList<>();

	public List<String> generateParenthesis(int n) {
		backtrack(res, "", 0, 0, n);
		return res;
	}

	public void backtrack(List<String> list, String str, int leftCount, int rightCount, int n) {
		if (str.length() == 2 * n) {
			list.add(str);
			return;
		}
		if (leftCount < n)
			backtrack(list, str + '(', leftCount + 1, rightCount, n);
		if (rightCount < leftCount)
			backtrack(list, str + ')', leftCount, rightCount + 1, n);
	}
}