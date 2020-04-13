package ArrayAndString;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 */
public class CombinationSum {
    int min = Integer.MAX_VALUE;

    public List<List<Integer>> combinationSum(int[] candidate, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> option = new ArrayList<>();
        for (int i=0;i<candidate.length;i++){
            min = Math.min(candidate[i],min);
        }
        backtrack(res,option,target, candidate,0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> option, int residual, int[] candidate, int id){
        if (residual ==0) {
            res.add(new ArrayList<>(option));
            return;
        }
        if (residual>=min) {
            for (int i = id; i < candidate.length; i++) {
                option.add(candidate[i]);
                backtrack(res, option, residual - candidate[i], candidate,i);
                option.remove(option.size()-1);
            }
        }
    }

    public static void main(String[] args){
        CombinationSum sol = new CombinationSum();
        int target = 7;
        int[] candidate = new int[] {2,3,6,7};
        System.out.println(sol.combinationSum(candidate,target));
    }
}


//  res.add(new ArrayList<>(list));