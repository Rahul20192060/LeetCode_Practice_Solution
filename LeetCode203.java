package com.Redon;
import java.util.*;
public class LeetCode203 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<> (List.of(1,2,6,3,4,5,6));
        System.out.println(list);
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i]= list.get(i);
        }

        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vale to remove: ");

        int value =sc.nextInt();

        Object[] filterarray = Arrays.stream(array).filter(num -> num !=value).toArray();
        System.out.println(Arrays.toString(filterarray));

    }
}
