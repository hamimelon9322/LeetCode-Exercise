import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>(); //新建栈
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node); //在队列尾部插入整数=在栈顶添加元素
    }
    
    public int pop() {
        if(!stack2.isEmpty()) return stack2.pop(); //栈2不为空，说明还有已经倒序过的元素在，直接出即可
        if(stack1.isEmpty()) return -1; //栈1为空说明没有元素
        while(!stack1.isEmpty()) 
            stack2.push(stack1.pop()); //注意这边是while，因为要将所有元素倒序压入栈2中
        return stack2.pop();
    }
}
