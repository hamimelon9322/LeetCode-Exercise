// 异或：异或是一种二进制的位运算，符号以 XOR 或 ^ 表示。相同为0，不同为1，A ^ 0 = A。
class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length <= 0) return 0;
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i] ^ (i+1);
            //当有缺失的数字时，后续等式中后两个元素一直相等得出0，即xor ^ 0 = xor，从而定位出缺失数字的位置
        }
        return xor;
    }
}
