package com.leetcode;

public class Maximum69Number {
    public int maximum69Number(int num){
        String str = Integer.toString(num);
        int N = str.length();
        char[] chars = str.toCharArray();

        for (int i=0;i<N;i++){
            if (chars[i]=='6'){
                chars[i] = '9';
                break;
            }
        }
         String res = new String(chars);
        return Integer.parseInt(res);
    }

    public static void main(String[] args){
        Maximum69Number sol = new Maximum69Number();
        int num = 9669;
        System.out.println(sol.maximum69Number(num));
    }
}

// Integer.toString(x)
//Integer.parseInt
// String(char)

