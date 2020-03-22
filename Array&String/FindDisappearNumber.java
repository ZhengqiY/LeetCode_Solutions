package ArrayAndString;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 * Example:
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [5,6]
 */
import java.util.*;
import java.util.HashMap;

public class FindDisappearNumber {
    public List<Integer> findDisappearNumber(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = nums.length;
        for (int i=1;i<=N;i++){
            map.put(i,0);
        }
        for(int i=0;i<N;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Integer keys:map.keySet()){
            if (map.get(keys)==0){
                res.add(keys);
            }
        }
        return res;
    }
}
