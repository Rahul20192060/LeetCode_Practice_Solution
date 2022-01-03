

import java.util.Arrays;
import java.util.Scanner;

public class MargeShort_Apna_Collage {
    public static void conquer(int[] a, int start, int mid, int end) {
        int[] marge = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= end) {
            if (a[index1] <= a[index2]) {
                marge[x] = a[index1];
                x++;
                index1++;
            } else {
                marge[x] = a[index2];
                x++;
                index2++;
            }
        }
        while (index1 <= mid) {
            marge[x++] = a[index1++];
        }

        while (index2 <= end) {
            marge[x++] = a[index2++];
        }

        for (int i = 0, j = start; i < marge.length; i++, j++) {
            a[j] = marge[i];
        }
    }

    public static void divide(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(a, start, mid);
        divide(a, mid + 1, end);
        conquer(a, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        divide(a, 0, n - 1);
        System.out.print(Arrays.toString(a));
        System.out.println();
    }
}

// Time Complexity: nlogn
