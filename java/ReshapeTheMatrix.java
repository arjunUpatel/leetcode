public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int inputRowLength = mat.length, inputColLength = mat[0].length;
		if (r * c != inputRowLength * inputColLength)
			return mat;
		int[][] result = new int[r][c];
		int rowTraverse = 0, colTraverse = 0;
		for (int row = 0; row < inputRowLength; row++) {
			for (int col = 0; col < inputColLength; col++) {
				result[rowTraverse][colTraverse] = mat[row][col];
				colTraverse++;
				if (colTraverse == c) {
					rowTraverse++;
					colTraverse = 0;
				}
			}
		}
		return result;
	}
}
