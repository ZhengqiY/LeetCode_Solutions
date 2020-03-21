package com.leetcode;
/**
 * Daily Temperature Stack Method
 */

import java.util.Stack;

public class DailyTempStack {
    public int[] dailyTempStack(int[] T){
        Stack<Integer> stack = new Stack<>();
        int N = T.length;
        int[] res = new int[N];
        for (int i=0;i<N;i++){
            while (!stack.isEmpty() && T[stack.peek()]<T[i]){
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        DailyTempStack sol = new DailyTempStack();
        int[] res = sol.dailyTempStack(new int[] {70,71,64,73});
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}

// peek, pop, push, isEmpty