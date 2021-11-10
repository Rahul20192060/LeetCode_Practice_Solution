package com.Redon;

import java.util.Scanner;

public class ArrangingCoins_LeetCode441 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i = 1;
        int res = 0;
       /* while(n >= i){
            n -= i;
            res++;
            i++;
        }*/
        for ( i = 0; i < n; i++) {
            n -=i;
            res++;
            i++;
        }
        System.out.println(res);
    }
}
