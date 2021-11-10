package com.Redon;

import java.util.Scanner;

public class MaxSumOf_SubArray_LeetCode {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < arr.length; i++) {
             arr[i]=scanner.nextInt();
        }
        System.out.println("The sum is: "+max_sum_subarray(arr));
    }

   public static int max_sum_subarray(int sum[]){
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;
       for (int i = 0; i < sum.length; i++) {
           current_sum=current_sum + sum[i];
           if(current_sum>max_sum){
               max_sum=current_sum;
           }
           if(current_sum < 0){
               current_sum=0;
           }
       }
       return max_sum;
   }
}


