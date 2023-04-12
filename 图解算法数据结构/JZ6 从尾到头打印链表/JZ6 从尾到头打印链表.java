/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>(); 
        //LinkedList<Integer> stack = new LinkedList<Integer>(); //采用LinkedList链表的栈
        while(head != null){
            stack.push(head.val);
            //stack.addLast(head.val);  //注意两者添加/删除元素的表述不一样
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for(int i = 0;i < res.length; i++)
            res[i] = stack.pop();
            //res[i] = stack.removeLast();
        return res;
    }
}