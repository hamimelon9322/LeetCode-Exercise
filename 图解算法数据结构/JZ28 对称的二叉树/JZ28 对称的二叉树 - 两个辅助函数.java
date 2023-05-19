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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode rootMirror = mirrorTree(root);
        return isSame(root, rootMirror); 
    }

    // 镜像反转二叉树
    private TreeNode mirrorTree(TreeNode root){
        if(root == null) return null;
        TreeNode newRoot = new TreeNode(root.val, mirrorTree(root.right),mirrorTree(root.left));
        // 传入的root并不做镜像变化，所以不需要tmp暂存左子树，直接镜像操作返回一个新的镜像树
        return newRoot;
    }

    // 判断两棵树是否相同
    private boolean isSame(TreeNode A, TreeNode B){
        if(B == null && A == null) return true;
        if(A == null ^ B == null) return false;
        if(A.val != B.val) return false;
        return isSame(A.left, B.left) && isSame(A.right, B.right);
        }
}
