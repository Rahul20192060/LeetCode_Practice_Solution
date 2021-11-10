package com.Redon;

import java.util.*;

public class MargeShortedArray_LeetCode88 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int size =m+n;
        int[] marged_array= new int[size];
        int[] nums1= new int[m];
        int[] nums2= new int[n];
        for(int i=0;i<m;i++){
            marged_array[i]=nums1[i];
        }
        int j=0;
        for (int i=m;i<size;i++){
            marged_array[i]=nums2[j];
            j++;
        }
        Arrays.sort(marged_array );
        for(int i=0;i<size;i++){
            nums1[i]=marged_array[i];
        }
        System.out.println(Arrays.toString(nums1));

    }
}
