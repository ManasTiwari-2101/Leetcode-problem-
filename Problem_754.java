class Solution {
    public int reachNumber(int target) {
        // Use absolute value since the line is symmetric
        int newTarget = Math.abs(target);
        int step = 0;
        int pos = 0;

        // Keep moving until we reach or go beyond the target
        while (pos < newTarget) {
            pos += ++step;
        }
        // If the overshoot (pos - target) is odd, keep stepping until it's even
        while ((pos - newTarget) % 2 != 0) {
            pos += ++step;
        }
        return step;
    }
}
