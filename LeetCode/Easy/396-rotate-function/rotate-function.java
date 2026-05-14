class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        int f0 = 0;

        // Calculate total sum and F(0)
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            f0 += i * nums[i];
        }

        int max = f0;
        int current = f0;

        // Use relation:
        // F(k) = F(k-1) + totalSum - n * nums[n-k]
        for (int k = 1; k < n; k++) {
            current = current + totalSum - n * nums[n - k];
            max = Math.max(max, current);
        }

        return max;
    }
}