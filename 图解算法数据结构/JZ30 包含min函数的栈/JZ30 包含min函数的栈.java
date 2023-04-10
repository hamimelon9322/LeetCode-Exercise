class MinStack {
    Stack<Integer> stack1, stack2;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack1.add(x);
        if(stack2.isEmpty() || stack2.peek() >=x ) //Stack1.peek() 返回栈顶元素，但不在堆栈中删除它；Stack2.pop() 返回栈顶元素，并在进程中删除它。isEmpty()和empty()一个效果
            stack2.add(x);
    }
    
    public void pop() {
        if(stack1.pop().equals(stack2.peek())) //写“==” 有部分案例未通过，==：比较的是两个字符串内存地址（堆内存）的数值是否相等，属于数值比较；equals()：比较的是两个字符串的内容，属于内容比较。
            stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */