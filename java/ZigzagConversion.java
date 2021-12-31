public class ZigzagConversion {
	public String convert(String s, int numRows) {
		int verticalIndex = 0, multiplier = 0, numCols = 0;
		for (int i = 0; i < s.length();) {
			if (numCols == verticalIndex) {
				i += numRows;
				multiplier++;
				verticalIndex = multiplier * numRows - multiplier;
			} else
				i++;
			numCols++;
		}
		String[][] twoD_arr = new String[numRows][numCols];
		boolean down = true;
		int row = 0, col = 0;
		for (int i = 0; i < s.length(); i++) {
			twoD_arr[row][col] = s.substring(i, i + 1);
			if (row == 0 && numRows > 1)
				down = true;
			if (row == numRows - 1)
				down = false;
			if (down)
				row++;
			else if (numRows > 1) {
				row--;
				col++;
			} else
				col++;
		}
		String result = "";
		for (String[] x : twoD_arr) {
			for (String y : x) {
				if (y != null)
					result += y;
			}
		}
		return result;
	}
}
