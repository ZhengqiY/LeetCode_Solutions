package com.leetcode;

/**
 * Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
 *
 * If possible, output any possible result.  If not possible, return the empty string.
 *
 * Example 1:
 *
 * Input: S = "aab"
 * Output: "aba"
 * Example 2:
 *
 * Input: S = "aaab"
 * Output: ""
 */
import java.util.HashMap;
import java.util.PriorityQueue;
import java.lang.Character;
public class ReorganizeString {
    public String reorganizeString(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int N=s.length();
        for (int i=0;i<N;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        /**for (char key:map.keySet()){
        *    if (map.get(key)>(N+1)/2) return "";
        }*/

        PriorityQueue<Character> queue = new PriorityQueue( (a,b) -> (map.get(b)-map.get(a)));
        for (char key:map.keySet()){
            queue.add(key);
        }
        StringBuilder res = new StringBuilder();
        while(queue.size()>1){
            char curr = queue.remove();
            char next = queue.remove();
            res.append(curr);
            res.append(next);
            map.put(curr,map.get(curr)-1);
            map.put(next,map.get(next)-1);
            if (map.get(curr)>0){
                queue.add(curr);
            }
            if (map.get(next)>0){
                queue.add(next);
            }
        }
        if (!queue.isEmpty()){
            char last = queue.remove();
            if (map.get(last)>1){
                return "";
            }else{
                res.append(last);
            }
        }

        return res.toString();
    }

    public static void main(String[] args){
        ReorganizeString sol = new ReorganizeString();
        String s = "aab";
        System.out.println(sol.reorganizeString(s));
    }

}

// PriorityQueue<XXX> name = new PriorityQueue<XXX>( (a,b) -> (b-a))
// queue.remove
// greedy