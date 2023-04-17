/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node cur = head;
        Map<Node,Node> map = new HashMap<>(); // 构建哈希表
        while(cur != null){
            map.put(cur,new Node(cur.val)); // 复制各节点，建立“原节点->新节点”的Map映射
            cur = cur.next; // 遍历
        }
        cur = head; // 构建新链表的 next 和 random 指向，从头开始重新遍历
        while(cur != null){
            map.get(cur).next = map.get(cur.next); // put是插入元素，get是获取元素
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head); // 返回新链表的头节点
    }
}