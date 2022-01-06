import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
	public static void main(String[] args) {
		generateParenthesis(2);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		ParenthesisNode root = createStateTree(new ParenthesisNode((char) 0, null, null), 0, 0, n);
		return res;
	}

	public static ParenthesisNode createStateTree(ParenthesisNode node, int leftCount, int rightCount, int n) {
		if (leftCount < n)
			node.left = createStateTree(new ParenthesisNode('('), leftCount + 1, rightCount, n);
		if (rightCount < n)
			node.right = createStateTree(new ParenthesisNode(')'), leftCount, rightCount + 1, n);
		return node;
	}

	static class ParenthesisNode {
		char type;
		ParenthesisNode left;
		ParenthesisNode right;

		public ParenthesisNode() {

		}

		public ParenthesisNode(char type) {
			this.type = type;
		}

		public ParenthesisNode(char type, ParenthesisNode left, ParenthesisNode right) {
			this.type = type;
			this.left = left;
			this.right = right;
		}
	}
}