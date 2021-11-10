package com.Redon;

import java.util.*;

public class Search_Insert_LeetCode35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

      List<Integer> list=new ArrayList<Integer>(a.length);
        for (int i:a){
            list.add(i);
        }
        int value=sc.nextInt();
        list.add(value);
        Collections.sort(list);
        System.out.println(list);
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(list);
        System.out.println(linkedHashSet);
        ArrayList<Integer> arrayList=new ArrayList<>(linkedHashSet);
        Integer arr[]=new Integer[arrayList.size()];
        arr=arrayList.toArray(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                System.out.println(i);
            }
        }

       /* for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)==value){
                System.out.println(i);*/
            }
        }


