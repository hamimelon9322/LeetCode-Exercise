class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        int left = 0,right = nums.length - 1;
        while(left <= right){
            int mid = (left+right) >> 1;
            if(nums[mid] == mid) 
	left = mid + 1;
            else 
	right = mid - 1;
        }

        if(right >= 0 && nums[right] == nums[nums.length-1]) return res;
        else return left;
    }
}