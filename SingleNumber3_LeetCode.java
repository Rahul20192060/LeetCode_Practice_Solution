package com.Redon;

import java.util.*;

public class SingleNumber3_LeetCode {

    public static void NonRepeating(int a[],int n)
    {
        int count;
        System.out.println("Non Repeating element in array");

        for(int i=0;i<n;i++)
        {
            count=0;
            //initialise the for loop for checking the elenemnt which are not repeated)
            for (int j = 0; j < n; j++)
            {
                //check the condition if any number is same so
                //incre
                if(a[i]==a[j] && i!=j)
                    count++;
            }
            //if count became zero so print the current element
            if(count==0)
                System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        //call the NonRepeating function
        NonRepeating(a,size);
    }

}
