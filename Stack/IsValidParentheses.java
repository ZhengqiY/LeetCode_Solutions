package com.leetcode;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
import java.util.Stack;
import java.util.HashMap;

public class IsValidParentheses {
    public boolean isValParentheses(String s){
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = initMap();
        int N = s.length();
        for (int i=0;i<N;i++) {
            if (map.containsValue(s.charAt(i)) || stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if (map.containsKey(s.charAt(i)) && stack.peek()==map.get(s.charAt(i))){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    private HashMap<Character,Character> initMap() {
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        return map;
    }

    public static void main(String[] args){
        IsValidParentheses sol = new IsValidParentheses();
        String s = "(])";
        System.out.println(sol.isValParentheses(s));
    }
}

// toCharArray, private, else if,