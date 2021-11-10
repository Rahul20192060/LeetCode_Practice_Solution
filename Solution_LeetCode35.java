package com.Redon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_LeetCode35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
           int x=scanner.nextInt();
           arrayList.add(x);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int value=scanner.nextInt();
        if(arrayList.contains(value)){
            System.out.println(arrayList.indexOf(value));
        }else{
            arrayList.add(value);
            Collections.sort(arrayList);
            System.out.println(arrayList.indexOf(value));
        }
    }
}
