class Solution {
    public int search(int[] nums, int target) {
        if (nums == null  ||  nums.length == 0) return 0;
        int leftIndex = search(nums, target, true);
        if (leftIndex == -1) return 0;
        int rightIndex = search(nums, target, false);
        return rightIndex + 1 - leftIndex;
    }
    public int search(int[] nums, int target, boolean itsLeft) {
        int left = 0, right = nums.length, mid = 0;
        while (left < right) {  // 左闭右开， 指针重合则结束
            mid = (left + right) >>> 1;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                if (itsLeft) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (! itsLeft) { // 找左侧直接返回， 找右侧需要指针减1
            left--;
        }
        if (left >= 0  &&  left < nums.length  &&  nums[left] == target) {
            return left;
        }
        return -1;
    }
}

作者：jean
链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/58lgr7/?discussion=12NuZw
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。