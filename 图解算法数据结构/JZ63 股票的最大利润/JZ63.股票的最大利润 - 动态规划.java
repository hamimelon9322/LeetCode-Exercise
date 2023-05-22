// 非简化版，时间和空间复杂度均为O(N)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        int minPrice = prices[0];
        for(int i = 1;i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            dp[i] = Math.max( dp[i-1], prices[i] - minPrice);
        }
        return dp[prices.length - 1];
    }
}

// 简化版，时间复杂度是O(N)，空间复杂度是O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, profit = 0; // Integer.MAX_VALUE表示int数据类型的最大取值数：2 147 483 647；Integer.MIN_VALUE表示int数据类型的最小取值数：-2 147 483 648
        for(int price : prices){ // price相当于prices[i]，注意遍历的写法 
            minPrice = Math.min(minPrice, price);
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }
}