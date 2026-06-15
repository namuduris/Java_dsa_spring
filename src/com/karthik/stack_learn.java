package com.karthik;

import java.util.Stack;

public class stack_learn {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(32);
        stack.push(65);
        stack.push(22);
        stack.push(19);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());




    }
}
