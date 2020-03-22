package com.leetcode;
/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] s){
        int N = s.length;
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i=0;i<N;i++){
            char[] s_array = s[i].toCharArray();
            Arrays.sort(s_array);
            String temp = new String(s_array);
            if (!map.containsKey(temp)){
                List<String> item = new ArrayList<String>();
                item.add(s[i]);
                map.put(temp,item);
            }else{
                map.get(temp).add(s[i]);
                }
            }

        List<List<String>> res = new ArrayList<List<String>>();
        for (List<String> value: map.values()){
            res.add(value);
        }
        return res;
    }

    public static void main(String[] args){
        GroupAnagrams sol = new GroupAnagrams();
        String[] s = {"eat","tan","tea","sun","nus"};
        System.out.println(sol.groupAnagrams(s));
    }
}

// HashMap<String, List<String>> map = new HashMap<String, List<String>>;
// List<String> item = new ArrayList<String>()
// item.add
//Arrays.sort
//map.keySet
//new String  !!!! toString 不一样！