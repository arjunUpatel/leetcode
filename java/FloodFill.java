public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];
        helper(image, visited, sr, sc, newColor, color);
        return image;
    }

    public void helper(int[][] image, int[][] visited, int sr, int sc, int newColor, int color) {
        if (sr > -1 && sr < image.length && sc > -1 && sc < image[0].length && image[sr][sc] == color
                && visited[sr][sc] == 0) {
            image[sr][sc] = newColor;
            visited[sr][sc] = 1;
            helper(image, visited, sr + 1, sc, newColor, color);
            helper(image, visited, sr - 1, sc, newColor, color);
            helper(image, visited, sr, sc + 1, newColor, color);
            helper(image, visited, sr, sc - 1, newColor, color);
        }
    }
}
