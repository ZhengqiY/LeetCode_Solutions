package com.leetcode;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        int N = s.length();
        for (int i=0;i<N;i++){
            map.put(s.charAt(i), (map.getOrDefault(s.charAt(i),0)+1));
        }
        for (int i=0;i<N;i++){
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), (map.get(t.charAt(i))-1));
            }else{
                map.put(t.charAt(i),(map.getOrDefault(t.charAt(i),0)+1));
            }
            if (map.get(t.charAt(i))==0) map.remove(t.charAt(i));
        }

        return map.isEmpty();
    }
    public static void main(String[] args){
        IsAnagram sol = new IsAnagram();
        String s = "abba";
        String t = "bba";
        System.out.println(sol.isAnagram(s,t));
    }
}


// charAt, toCharArray