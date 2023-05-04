// 未使用旋转数组的特征，只是寻找最小数字
class Solution {
    public int minArray(int[] numbers) {
        int i = numbers.length - 1;
        int res = numbers[i];
        while(i >= 0){
            if(numbers[i] < res) 
                res = numbers[i];
            i--;
        }
        return res;
    }
}