// 简单计数判断，没有用上“排序”条件，复杂度偏高
class Solution {
    public int search(int[] nums, int target) {
        int tmp = 0;
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i] == target)
                tmp++;
        }
        return tmp;
    }
}