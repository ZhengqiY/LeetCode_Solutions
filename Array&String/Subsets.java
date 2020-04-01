package ArrayAndString;
/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */

import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        res.add(list);
        if (nums.length==0) return res;
        backtrack(list,nums,res,0);
        return res;
    }

    public void backtrack(List<Integer> list, int[] nums, List<List<Integer>> res,int id){
        for (int i = id; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(list, nums, res, i + 1);
            res.add(new ArrayList<>(list));
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args){
        Subsets sol = new Subsets();
        int[] nums = new int[] {1,2,3};
        System.out.println(sol.subsets(nums));
    }
}
