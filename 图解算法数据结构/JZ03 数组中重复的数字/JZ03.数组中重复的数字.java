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

// 方法二：原地交换-即swap一个思路
class Solution {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}