public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int waterLevel, maxArea = 0, front = 0, end = height.length - 1;
        while (front < end) {
            waterLevel = height[front] < height[end] ? height[front] : height[end];
            maxArea = maxArea < waterLevel * (end - front) ? waterLevel * (end - front) : maxArea;
            if (height[front] <= height[end]) {
                front++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
