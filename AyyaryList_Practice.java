package com.Redon;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
*/
import java.util.*;
import java.util.stream.Collectors;

public class AyyaryList_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list= new ArrayList();
        while(true) {
            if (!sc.hasNextInt()) break;
            list.add(sc.nextInt());
        }
        System.out.print("Unsorted Arraylist"+": ");
        System.out.println(list);
        Collections.sort(list);
        System.out.print("Sorted ArrayList"+": ");
        System.out.println(list);
       /* LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(list);
        ArrayList<Integer> arrayList=new ArrayList<>(linkedHashSet);
        System.out.println(arrayList);*/
        List<Integer> numbers= list.stream().distinct().collect(Collectors.toList());
        System.out.print("Removed Duplicates: ");
        System.out.println(numbers);
        
    }
}
