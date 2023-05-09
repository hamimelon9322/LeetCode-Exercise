/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
I. 按层打印： 题目要求的二叉树的从上至下打印（即按层打印），又称为二叉树的广度优先搜索（BFS）。
BFS 通常借助 队列 的先入先出特性来实现。

层遍
根判空返回
队列先进根
循环取队头
看值进左右
 */
// 时间复杂度：O(N)、空间复杂度O(N)
class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};// 双括号初始化（double brace initialization）
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll(); // poll()弹出元素（删除），与remove()不同点在于：在容量为0的时候，remove()会抛出异常，poll()返回false
            ans.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i < ans.size(); i++ )
            res[i] = ans.get(i);
        return res;
    }
}