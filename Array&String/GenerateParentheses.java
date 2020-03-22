package ArrayAndString;
/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
import java.util.*;
public class GenerateParentheses {
    public List<String> generateParentheses(int n){
        List<String> res = new ArrayList<>();
        backtrack(res,"", 0,0,n);
        return res;
    }

    public void backtrack(List<String> res, String curr_s,int open, int close, int max){
        if (curr_s.length()==max*2) {
            res.add(curr_s);
        }
        if (open<max) backtrack(res,curr_s+"(",open+1,close,max);
        if (close<open) backtrack(res,curr_s+")",open,close+1,max);
    }
}
