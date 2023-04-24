class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // if(matrix.length == 0) return false;
        int i = matrix.length - 1, j = 0; // 找到矩阵左下角的值，注意矩阵的行长度为matrix.length，列长度为matrix[0].length
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}