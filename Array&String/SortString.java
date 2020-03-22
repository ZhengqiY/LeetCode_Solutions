package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;


public class SortString {
    public String sortString(String s){
        if (s==null) return null;
        int N = s.length();
        int[] freq = new int[26];
        for (int i=0;i<N;i++){
            freq[s.charAt(i)-'a']+=1;
        }

        StringBuilder res = new StringBuilder();
        boolean go = true;

        while (go) {
            go=false;
            for (int i = 0; i < 26; i++) {
                if (freq[i]!=0) {
                    res.append((char) ('a' + i));
                    freq[i] --;
                    go=true;
                }
            }
            for (int i=25;i>=0;i--){
                if (freq[i]!=0) {
                    res.append(((char) ('a' + i)));
                    freq[i]--;
                    go=true;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        SortString sol = new SortString();
        String s = "abab";
        System.out.println(sol.sortString(s));
    }
}

//collection.sort
// ArrayList.get

