// 简化版 时间复杂度O(n)，空间复杂度O(1)
class Solution {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0 ; i < n; i++){
            sum = ( a + b ) % 1000000007;
            a = b;
            b = sum; 
        }
        return a;
    }
}

//以数组形式 时间复杂度O(n)，空间复杂度O(n)
class Solution {
    public int numWays(int n) {
        if(n == 0) return 1; // 一定要有这个判断，否则在n为0时，dp[1]就超出数组范围无法赋值会报错
        int[] dp = new int[n + 1]; // 注意数组大小，因为返回的数组和台阶相对应，所以下边i<=n，这边数组大小为n+1
        dp[0] = 1;
        dp[1] = 1; 
        for(int i = 2;i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}