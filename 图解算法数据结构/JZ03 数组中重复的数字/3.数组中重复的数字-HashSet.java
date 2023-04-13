import java.util.*;

//解法四，利用HashSet记录，出现重复数字时立马返回结果

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        if(numbers == null || numbers.length == 0 ) return -1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<numbers.length;i++){
            if(set.contains(numbers[i])){
                return numbers[i];//该数字已经存在于set中，重复了
            }else{
                set.add(numbers[i]);//该数字不在set中，添加进去
            }
        }
        return -1;
    }
}