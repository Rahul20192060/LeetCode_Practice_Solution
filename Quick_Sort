

import java.util.Arrays;
import java.util.Scanner;

public class QuickShort_ApnaCollage {
    public static int partition(int[] a, int low, int high) {
        int pviot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pviot) {
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pviot;
        a[high] = temp;
        return i;
    }

    public static void quickShort(int[] a, int low, int high) {
        if (low < high) {
            int pidx = partition(a, low, high);

            quickShort(a, low, pidx - 1);
            quickShort(a, pidx + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        quickShort(a, 0, n - 1);

        //print
        System.out.print("The OutPut: ");
        System.out.print(Arrays.toString(a));
        System.out.println();
    }
}
