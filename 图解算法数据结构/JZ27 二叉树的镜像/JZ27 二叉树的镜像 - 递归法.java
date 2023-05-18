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
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
/**Q： 为何需要暂存 root 的左子节点？
A： 在递归右子节点 “root.left=mirrorTree(root.right);” 执行完毕后， root.left 的值已经发生改变，此时递归左子节点 mirrorTree(root.left) 则会出问题。**/
