package com.karthik.stack_questions;
import java.util.*;
public class dailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answers = new int[n];
        // Stack will store the indices of the days
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While stack is not empty AND the current day's temperature
            // is warmer than the temperature of the day at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int previousDayIndex = stack.pop();
                // The number of days waited is the difference between current index and previous index
                answers[previousDayIndex] = i - previousDayIndex;
            }
            // Push the current day's index onto the stack to wait for its warmer day
            stack.push(i);
        }

        return answers;
    }
}
