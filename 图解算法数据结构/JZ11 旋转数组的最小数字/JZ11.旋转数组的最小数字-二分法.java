// 时间复杂度O(log2 N)：在特殊情况下（例如[1, 1, 1, 1]），会退化到O(N)。
// 空间复杂度O(1)：i, j, m 变量使用常数大小的额外空间
class Solution {
    public int minArray(int[] numbers) {
        int i = 0,j = numbers.length - 1;
        while(i < j){
            int m = i +j >>1;
            if(numbers[m] > numbers[j]) i = m +1; // 为了确定middle是在左排序还是右排序，所以直接和numbers[j]比较，和numbers[i]比较无法得出结果。
            else if(numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i]; // 注意返回值和j--的妙处所在
    }
}