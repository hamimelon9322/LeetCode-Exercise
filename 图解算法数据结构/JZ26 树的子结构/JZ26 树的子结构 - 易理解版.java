/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false; // 特例处理，如果树A为空或树B为空，直接返回false
        boolean res = false; // 注意res初始化可以直接赋false，这样返回res不会出现空值
        res = dfs(A,B); // 深度优先遍历中采用前序遍历
        if(res == true) return res;
        res = isSubStructure(A.left,B) || isSubStructure(A.right,B); 
        return res;

    }

        private boolean dfs(TreeNode A, TreeNode B){
            if(B == null) return true;
            if(A == null || A.val != B.val) return false;
            return (A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right));
        }

}