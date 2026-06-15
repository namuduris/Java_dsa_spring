package com.karthik;
import java.util.*;
public class PolishNotations {
    public static int main(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int a = stack.pop();
                int b = stack.pop();

                switch(s){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                }

            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
