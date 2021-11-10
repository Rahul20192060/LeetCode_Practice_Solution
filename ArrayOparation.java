package com.Redon;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOparation {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n+1];
        for (int i = 0; i < a.length-1; i++) {
            a[i]=scanner.nextInt();
        }
        int location=scanner.nextInt();
        int new_element=scanner.nextInt();

      for (int i=n;i>location;i--){
          a[i]=a[i-1];
      }
      a[location]=new_element;
      n++;

            System.out.println(Arrays.toString(a));


    }
}
