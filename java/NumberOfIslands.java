public class NumberOfIslands {
	public int numIslands(char[][] grid) {
		int result = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == '1') {
					searchForLand(grid, row, col);
					result++;
				}
			}
		}
		return result;
	}

	private void searchForLand(char[][] grid, int row, int col) {
		try {
			if (grid[row + 1][col] == '1') {
				grid[row + 1][col] = '0';
				searchForLand(grid, row + 1, col);
			}
		} catch (Exception e) {
		}
		try {
			if (grid[row][col + 1] == '1') {
				grid[row][col + 1] = '0';
				searchForLand(grid, row, col + 1);
			}
		} catch (Exception e) {
		}
		try {
			if (grid[row - 1][col] == '1') {
				grid[row - 1][col] = '0';
				searchForLand(grid, row - 1, col);
			}
		} catch (Exception e) {
		}
		try {
			if (grid[row][col - 1] == '1') {
				grid[row][col - 1] = '0';
				searchForLand(grid, row, col - 1);
			}
		} catch (Exception e) {
		}
	}
}