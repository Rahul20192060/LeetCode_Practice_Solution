package com.Redon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddOne_LeetCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=scanner.nextInt();
        }

        System.out.println(plusOne(a));

    }
    public static int plusOne(int[] digits){
        int d=digits.length-1;
        /*for(int i=d;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }


            digits[i]=0;
        }*/



        /*int[] new_digits = new int[digits.length+1];
        new_digits[0]=1;
        return new_digits;*/

        if(digits[d]==9){
            digits[d]=1;
            ArrayList<Integer> arrayList=new ArrayList<>(digits.length);
            for(int i:digits){
                arrayList.add(i);
            }
            arrayList.add(0);
            System.out.println(arrayList);
        }else{
            digits[d]+=digits[d];
            System.out.println(Arrays.toString(digits));
        }


        return d;
    }
}
