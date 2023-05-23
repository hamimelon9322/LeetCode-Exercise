// 非简化版 - 完整思路
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return Integer.MIN_VALUE;
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        int maxSum = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(dp[i-1] <= 0) dp[i] = nums[i];
            else dp[i] = dp[i - 1] + nums[i];
            // if(dp[i] > maxSum) maxSum = dp[i];
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}

// 简化版-把nums[i]当动态规划的数组用
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] += Math.max(nums[i - 1], 0); // 这个写法很绝，直接判断nums[i-1]（逻辑上就是dp[i-1]）的正负
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
