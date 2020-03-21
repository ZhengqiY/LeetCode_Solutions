package com.leetcode;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */

import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void pop(){
        stack.pop();
        stack2.pop();
    }
    public void push(int x){
        stack.push(x);
        if (stack2.isEmpty()){
            stack2.push(x);
        }else{
            int min = stack2.peek();
            stack2.push(Math.min(min,x));
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return stack2.peek();
    }

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());

    }
}


// math.min