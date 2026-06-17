package com.karthik;

import java.util.Stack;

public class stack_learn {
    public static int[] getMinMax() {
        int min = 1;
        int max = 100;
        return new int[]{min, max}; // Return an array containing both integers
    }

    public static void main(String[] args) {
        int[] result = getMinMax();
        System.out.println(result[0] + " " + result[1]);
    }
}

