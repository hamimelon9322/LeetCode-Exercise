/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return recur(head,null); //调用递归并返回，传入null是因为反转链表后，head节点指向null；
    }
    private ListNode recur(ListNode cur, ListNode pre){
        if(cur == null) return pre;	             //终止条件
        ListNode res = recur(cur.next,cur); //递归后继节点
        cur.next = pre; 		            //修改节点引用指向
        return res;		            //返回反转链表的头节点
    }
}