class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int windowSum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            if ((right - left + 1) == k) {
                maxAvg = Math.max(maxAvg, windowSum / (double) k);
                windowSum -= nums[left];
                left++;
            }
        }
        return maxAvg;
    }
}
