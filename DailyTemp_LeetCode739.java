package com.Redon;

import java.util.*;

public class DailyTemp_LeetCode739 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int []tem= new int[n];
        for (int i = 0; i < tem.length; i++) {
            tem[i]=scanner.nextInt();
        }

        int size = tem.length;
        int arr[] =new int[size];
        int l=0;
        for(int i=0;i<size;i++) {
            int k=1;
            for(int j=i+1;j<size;j++) {
                if(tem[i]>=tem[j]) {
                    k++;
                }
                else {
                    l++;
                    break;
                }
            }
            if(l!=0) {
                arr[i]=k;
                l=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
