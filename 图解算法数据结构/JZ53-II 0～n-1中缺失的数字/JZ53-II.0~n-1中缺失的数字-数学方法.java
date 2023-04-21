class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2; //0 到 length 之间总共有length + 1位数
        for(int i = 0;i < len;i++)
            sum -= nums[i]; // 如果不缺该数字则为等差数列
        return sum;
    }
}