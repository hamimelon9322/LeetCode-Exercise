//27.移除元素-方法一：暴力解法
class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int i = 0; i < size; i++){
            if(nums[i] == val){
                for(int j = i + 1; j < size; j++ ){
                    nums[j-1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
}

//移除元素-方法二：快慢指针
class Solution {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for(int fastIndex = 0; fastIndex < nums.length; fastIndex++){
            if(nums[fastIndex] != val){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
    return slowIndex;
    }
}

//移除元素-方法三：相向指针法
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        while(right >= 0 && nums[right] == val) right--;//将right移到从右数第一个值不为val的位置
        while(left <= right){
            if(nums[left] == val){ //left位置的元素需要移除
                //将right位置的元素移到left（覆盖），right位置移除
                nums[left] = nums[right];
                right--;
            }
            left++;
            while(right >= 0 && nums[right] == val) right--;
        }
        return left;
    }
}