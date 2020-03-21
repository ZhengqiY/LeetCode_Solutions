package stack;
/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Example 2:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 */

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t){
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        int N = s.length();
        int N2 = t.length();

        for (int i=0;i<N;i++){
            if (s.charAt(i)=='#'&&stack1.size()>0){
                stack1.pop();
            }else if (s.charAt(i)!='#'){
                stack1.push(s.charAt(i));
            }
        }

        for (int i=0;i<N;i++){
            if (t.charAt(i)=='#'&&stack2.size()>0){
                stack2.pop();
            }else if (t.charAt(i)!='#'){
                stack2.push(t.charAt(i));
            }
        }

        return stack1.equals(stack2);
    }

    public static void main(String[] args){
        BackspaceCompare sol = new BackspaceCompare();
        String s = "a#c";
        String t = "ad#c";
        System.out.println(sol.backspaceCompare(s,t));

    }
}
