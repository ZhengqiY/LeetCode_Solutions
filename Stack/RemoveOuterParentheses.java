package com.leetcode;

/**
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 *
 *
 *
 * Example 1:
 *
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s){
        int N = s.length();
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        //String res = "";
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<N;i++){
            if(stack.isEmpty()){
                list.add(i);
                stack.push(array[i]);
                continue;
            }
            if (stack.peek()=='('&&array[i]==')'){
                stack.pop(); if (stack.isEmpty()) list.add(i);

            }else{
                stack.push(array[i]);
            }
        }
        System.out.println(list);
        StringBuilder res = new StringBuilder();
        for (int i=0;i<list.size();i+=2){
            res.append(s.substring(list.get(i)+1,list.get(i+1)));
        }
        String ans = new String(res);
        //return res.toString();
        return ans; //be careful toString, new String, and String.valueOf

    }

    public static void main(String[] args){
        RemoveOuterParentheses sol = new RemoveOuterParentheses();
        String s = "(()())";
        System.out.println(sol.removeOuterParentheses(s));
    }

}

//initialize string, toCharArray, ArrayList, List, for(char c:s.toCharArray)
// list.get, StringBuilder, append, substring