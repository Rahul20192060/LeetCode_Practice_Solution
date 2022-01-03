

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
	
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key= arr[i];
			int j=i-1;
			while((j>-1) && (arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
          System.out.print("Before Insertion Sort: ");
          System.out.print(Arrays.toString(arr));
          System.out.println();
          insertionSort(arr);
          System.out.print(Arrays.toString(arr));
          scanner.close();
	}

}

// Time Complexity: O(N^2)
