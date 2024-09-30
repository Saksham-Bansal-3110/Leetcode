class CustomStack {
    private int size;
    private int top;
    private int capacity;
    private int[] stack;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        size = 0;
        top = 0;
        capacity = maxSize;
    }
    
    public void push(int x) {
        if(size != capacity){
            stack[top] = x;
            top++;
            size++;
        }
    }
    
    public int pop() {
        if(size != 0){
            top--;
            size--;
            return stack[top];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        if(size >= k){
            for(int i=0;i<k;i++){
                stack[i] += val;
            }
        }
        else if(size < k){
            for(int i=0;i<size;i++){
                stack[i] += val; 
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
