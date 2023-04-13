import java.util.*;

// 解法二：移动元素让下标和值相对应 时间复杂度O（n），空间复杂度未开辟额外空间O（1）

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        if(numbers == null || numbers.length == 0) return -1;

        for(int i = 0;i < numbers.length;i++){
            while(numbers[i] != i){//用while只有在元素和下标全部一致的时候才会跳出循环
                if(numbers[i] == numbers[numbers[i]]){
                    return numbers[i];
                }
                //不相等则交换
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;   
            }
        }
        return -1; 
    }
}