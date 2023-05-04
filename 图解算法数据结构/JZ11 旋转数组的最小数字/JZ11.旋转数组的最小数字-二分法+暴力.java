class Solution {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while(i < j){
            int m = (i + j) >> 1;
            if(numbers[m] > numbers[j]) i = m + 1;
            else if(numbers[m] < numbers[j]) j = m;
            else{ // 当numbers[m]==numbers[j],一定会有区间[i,m]或者[m,j]内所有元素相等，这时候可以直接暴力搜寻最小值（线性查找来替代）
                int x = i;
                for(int k = i + 1;k < j; k++){
                    if(numbers[k] < numbers[x]) x = k;
                }
                return numbers[x];
            }
        }
        return numbers[i];
    }
}