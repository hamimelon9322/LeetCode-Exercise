class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == i) continue;
            else return i;
        }
        return nums.length; // 如果输入[0]，则缺失的为最后一位即长度值
    }
}