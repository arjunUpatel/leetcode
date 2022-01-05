import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		ParenthesisNode root = createStateTree(new ParenthesisNode(), 0, 0);
	}

	public ParenthesisNode createStateTree(ParenthesisNode node, int leftCount, int rightCount){
		if(leftCount < 3) {
			node.left.type = -1;
			node.left = createStateTree(node.left, leftCount++, rightCount);
		}
		if(rightCount < 3) {
			node.right.type = 1;
			node.right = createStateTree(node.left, rightCount, leftCount);
		}
		return node;
	}

	class ParenthesisNode {
		int type;
		ParenthesisNode left;
		ParenthesisNode right;

		public ParenthesisNode() {

		}

		public ParenthesisNode(int type) {
			this.type = type;
		}

		public ParenthesisNode(int type, ParenthesisNode left, ParenthesisNode right) {
			this.type = type;
			this.left = left;
			this.right = right;
		}
	}
}