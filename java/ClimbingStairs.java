public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        for (int i = n; i >= 0; i--) {
            if (i == n || i == n - 1)
                arr[i] = 1;
            else
                arr[i] = arr[i + 1] + arr[i + 2];
        }
        return arr[0];
    }
}
