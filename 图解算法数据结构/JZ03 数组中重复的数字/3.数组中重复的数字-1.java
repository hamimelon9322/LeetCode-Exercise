import java.util.*;

//解法一：建立一个新数组打卡标记

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        //检查参数合法性
        if(numbers == null || numbers.length == 0) return -1;
        //数组中有数字不在0~n-1范围内时不符合题意，直接返回-1
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] < 0 || numbers[i]>numbers.length-1) return -1;
        }
        int[] temp = new int[numbers.length];//声明数组用于标记numbers数组中每个数字出现的次数
        for(int i = 0; i < numbers.length;i++){
            temp[numbers[i]]++;
        }
        for(int i = 0; i <temp.length; i++){
            if(temp[i] > 1){//次数大于1，i就是重复的
                return i;//返回的是i，trmp[i]表示出现的次数，i才是重复的数字
            }
        }
        return -1;//没有重复的数字
    }
}