package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class IsHappy {
    public boolean isHappy(int n){
        if (n<1){
            return false;
        }
       // HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        while (n!=1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while (n>0) {
                int a = n % 10;
                int a2 = a * a;
                sum += a2;
                n /= 10;
            }
            n = sum;
        }
        return n==1;

        
    }
    public static void main(String[] args){
        IsHappy sol = new IsHappy();
        System.out.println(sol.isHappy(34));
    }
}

// HashSet, int digits square (divide and product)
