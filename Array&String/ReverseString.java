package com.leetcode;

public class ReverseString {
    public void reverseString(char[] s){
        int id = 0;
        int N = s.length;
        int i = N-1;
        while (id<i){
            char temp = s[id];
            s[id] = s[i];
            s[i] = temp;
            id++;
            i--;
        }
    }
}

//two pointers
