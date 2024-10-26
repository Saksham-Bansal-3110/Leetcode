class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(min.peek())){
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!min.isEmpty()){
            return min.peek();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
