class MinStack {
    // int arr[];
    // int top;
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        // arr=new int[];
        stack = new Stack<>();
        minStack = new Stack<>();
        // top=-1;
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek()){
            minStack.push(value);
        }

        // if(top==arr.length-1){
        //     Sys
        //     return;
        // }
        // arr[++top]=value;
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();

        // if(top==-1){
        //     return;
        // }
        // System.out.print(arr[top--]);
    }
    
    public int top() {
        return stack.peek();

        // if(top==-1){
        //     return -1;
        // }
        // return arr[top];
    }
    
    public int getMin() {
        return minStack.peek();

        // if(top==-1) return -1;
        // int min=arr[0];
        // for(int i=top;i>=0;i--){
        //     if(arr[i]<=min){
        //         min=arr[i];
        //     }
        // }
        // return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */