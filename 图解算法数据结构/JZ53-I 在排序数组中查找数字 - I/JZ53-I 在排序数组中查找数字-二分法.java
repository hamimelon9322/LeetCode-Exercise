// 排序数组中的搜索问题-二分法
class Solution {
    public int search(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0, j = nums.length-1;
        while(i <= j){
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j =m-1;
        }
        int right = i;
        // 若数组中没有target,则提前返回
        if(j>=0 && nums[j] != target) return 0 ;
        // 搜索左边界
        i = 0; j = nums.length-1;
        while(i<=j){
            int m = (i+j) / 2;
            if(nums[m] < target) i = m+1;
            else j = m - 1;
        }
        int left = j;
        return right-left-1;
    }
}

// 二分法简化代码--左边界本质是在找target-1的右边界
// 如果不存在target-1，最终还是会停在比（target-1）第一个大的数，也就是target第一个值的位置
class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target) - helper(nums,target-1);
    }
    int helper(int[] nums,int tar){
        int i = 0 ,j = nums.length - 1;
        while(i<=j){
            int m = (i+j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else  j = m - 1 ;
        }
        return i ;
    }
}