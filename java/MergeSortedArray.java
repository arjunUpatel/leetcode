public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		if (m == 0)
			nums1 = nums2;
		while (m > 0 && n > 0) {
			if (nums1[m - 1] <= nums2[n - 1]) {
				nums1[index] = nums2[n - 1];
			} else {
				nums1[index] = nums1[m - 1];
				nums1[m - 1] = nums2[n - 1];
				m--;
			}
			n--;
			index--;
			for (int i = 0; i < nums1.length; i++) {
				System.out.print(nums1[i] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

	public static void main(String[] args) {
		int m = 0, n = 1;
		int[] nums1 = { 0 };
		int[] nums2 = { 1 };
		merge(nums1, m, nums2, n);
	}
}