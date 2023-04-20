//209. 长度最小的子数组-滑动窗口
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result  = Integer.MAX_VALUE;//表示int数据类型的最大取值数
        for(int right = 0;right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                result = Math.min(result,right - left + 1);//取两者之间的最小值，等于不断更新result直到找到最小值
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;//如果result到达最大取值数也就没有符合题目条件的子数组，返回0
    }
}