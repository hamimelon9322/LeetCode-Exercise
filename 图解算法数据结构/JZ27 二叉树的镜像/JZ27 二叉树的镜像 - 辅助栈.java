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
        Stack<TreeNode> stack = new Stack<>(){{add(root);}};
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left != null) stack.add(node.left);
            if(node.right != null) stack.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
/**在上述代码中，虽然没有显式地返回栈 `stack` 的元素，但最后返回的是原始的根节点 `root`。在镜像反转的过程中，根节点的左右子节点的交换操作是直接在原始树上进行的，所以最终的结果已经反映在原始根节点 `root` 上了。
当我们修改了每个节点的左右子节点后，整个树的结构已经改变了。在函数执行完毕后，我们直接返回原始根节点 `root`，此时根节点已经是镜像反转后的树的根节点。所以无需显式地返回栈 `stack` 的元素，而是返回原始根节点即可。
需要注意的是，在代码中使用栈 `stack` 的主要目的是迭代地遍历每个节点，以实现镜像反转的操作。栈 `stack` 不是用于保存镜像反转后的树的节点的数据结构，而是在遍历过程中辅助使用的工具。**/