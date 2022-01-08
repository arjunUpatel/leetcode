public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length, mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (lo == hi || nums[mid] == target)
                return mid;
            if (target < nums[mid])
                hi = mid;
            else if (target > nums[mid])
                lo = mid + 1;
        }
        return lo + (hi - lo) / 2;
    }
}