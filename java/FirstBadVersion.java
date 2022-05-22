public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 0, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid) && !isBadVersion(mid - 1))
                return mid;
            else if (isBadVersion(mid) && isBadVersion(mid - 1))
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return n;
    }
}