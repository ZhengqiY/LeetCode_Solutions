package stack;

/**
 * Given a string s of lower and upper case English letters.
 *
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 *
 * 0 <= i <= s.length - 2
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 *
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 *
 * Notice that an empty string is also good.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leEeetcode"
 * Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 */

import java.util.Stack;

public class MakeGood {
    public String makeGood(String s){
        Stack<Character> stack1 = new Stack<>();
        int N = s.length();
        for (int i=0;i<N;i++){
            if (stack1.isEmpty()){
                stack1.push(s.charAt(i));
            }else{
                if (!Character.isUpperCase(stack1.peek()) && !Character.isUpperCase(s.charAt(i))){
                    stack1.push(s.charAt(i));
                }else{
                    if (Character.isUpperCase(stack1.peek())){
                        if (Character.toLowerCase(stack1.peek())!=s.charAt(i)){
                            stack1.push(s.charAt(i));
                        }else{
                            stack1.pop();
                        }
                    }else if (!Character.isUpperCase(stack1.peek())){
                        if (Character.toUpperCase(stack1.peek())!=s.charAt(i)){
                            stack1.push(s.charAt(i));
                        }else{
                            stack1.pop();
                        }
                    }
                }
            }
        }
        String res ="";
        for (char item : stack1){
            res+=item;
        }
        return res;
    }
}
// The difference between ASCII code of 'a' and 'A' is 32
