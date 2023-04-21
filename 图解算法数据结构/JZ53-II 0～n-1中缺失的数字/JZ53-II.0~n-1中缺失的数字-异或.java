// 异或：异或是一种二进制的位运算，符号以 XOR 或 ^ 表示。相同为0，不同为1，A ^ 0 = A。
class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length <= 0) return 0;
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i] ^ (i+1);
            //0 到 length 之间总共有length + 1位数
            //但是nums[]的下标为0，length - 1
            //i的实际下标应该为 1，length +1
        }
        return xor;
    }
}