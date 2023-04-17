// LeetCode将哈希表简化一丢丢+原地交换的方法二
class Solution {
    public int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        HashSet set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
    }
}
