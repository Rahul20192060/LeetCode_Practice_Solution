package com.Redon;
import java.util.*;
public class Reverse_arraylist {
    private static int i;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        ArrayList<Integer> arrayList=new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int x=scanner.nextInt();
            arrayList.add(x);
        }
      
        Integer arr[] =new Integer[arrayList.size()];
        arr=arrayList.toArray(arr);

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        List<Integer[]> list=new ArrayList<>(arr.length);
        for (int i:arr) {
            list.add(arr);
        }
            System.out.print(Arrays.toString(list.get(i)) +" ");
    }
}
