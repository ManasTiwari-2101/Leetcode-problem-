class Solution {
    public boolean isPerfectSquare(int x) {
        if (x < 2) return true;

        int start= 1, end = x / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;

            if (sq == x) return true;
            if (sq < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
