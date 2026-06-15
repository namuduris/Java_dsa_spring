package com.karthik.stack_questions;
import java.util.*;
public class minStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public minStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if(minStack.isEmpty()){
            minStack.push(value);
        }else{
            int currentMin = minStack.peek();
            minStack.push(Math.min(value,currentMin));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
