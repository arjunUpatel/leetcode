public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi])
                lo = mid + 1;
            else if (nums[mid] < nums[hi])
                hi = mid;
        }
        int min = lo;
        if (min == 0)
            return binarySearch(nums, 0, nums.length, target);
        else {
            int leftSearch = binarySearch(nums, 0, min, target);
            int rightSearch = binarySearch(nums, min, nums.length, target);
            if (leftSearch != -1)
                return leftSearch;
            if (rightSearch != -1)
                return rightSearch;
            return -1;
        }
    }

    public int binarySearch(int[] nums, int lo, int hi, int target) {
        int mid = lo + (hi - lo) / 2;
        if (lo >= hi)
            return -1;
        if (nums[mid] == target)
            return mid;
        if (target < nums[mid])
            return binarySearch(nums, lo, mid, target);
        return binarySearch(nums, mid + 1, hi, target);
    }
}