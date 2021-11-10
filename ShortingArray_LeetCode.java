package com.Redon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ShortingArray_LeetCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        IntStream.iterate(a.length - 1, i -> i >= 0, i -> i - 1).forEach(i -> a[i] = sc.nextInt());

        Arrays.sort(a);
        Arrays.stream(a).mapToObj(i -> i + " ").forEach(System.out::print);

        System.out.println();

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i] != a[j]) continue;
                a[j]=0;
            }
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
