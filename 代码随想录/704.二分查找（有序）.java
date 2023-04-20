//704. 二分查找-[left,right]
class Solution {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length -1 ]){
            return -1;
        }
        int left = 0, right = nums.length -1;
        while(left<=right){
            int mid = left +((right - left) >> 1 ); //>>为按位右移运算符，可以做到双数÷2，（单数-1）÷2的效果
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid+1;
            else if(nums[mid] > target)
                right =mid-1;
        }
        return -1;
    }
}

//二分查找-[left,right)
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right =nums.length;
        while(left < right){
            int mid = left + ((right-left) >> 1 );
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] > target)
                right = mid; //这边相当于右边的right值永远不会取
        }
        return -1;
    }
}