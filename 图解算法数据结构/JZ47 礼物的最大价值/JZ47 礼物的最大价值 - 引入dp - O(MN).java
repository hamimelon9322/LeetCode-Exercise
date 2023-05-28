import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param grid int整型二维数组 
     * @return int整型
     */
    public int maxValue (int[][] grid) {
        int line = grid.length, col = grid[0].length;
        int[][] dp = new int[line][col];
        dp[0][0] = grid[0][0];

        for(int i = 1;i < line; i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int j = 1;j < col; j++){
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        for(int i = 1;i < line;i++){
            for(int j = 1;j < col;j++){
                dp[i][j] = grid[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[line-1][col-1];
    }
}