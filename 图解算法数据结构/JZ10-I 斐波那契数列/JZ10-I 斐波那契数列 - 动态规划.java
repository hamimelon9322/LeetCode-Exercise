class Solution {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0;  i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}

// 直接用递归法将两个子问题拆分并递归，出现重复计算，真实运行会超出时间限制。
// 大数越界： 随着 n 增大, f(n) 会超过 Int32 甚至 Int64 的取值范围，导致最终的返回值错误。