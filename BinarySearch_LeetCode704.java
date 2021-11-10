package JavaDSAAlgo;

import java.util.Scanner;

public class BinarySearch_LeetCode704 {
	
	public static int search(int nums[], int target) {
		int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if target is present at mid
            if (nums[m] == target)
                return m;
 
            // If target greater, ignore left half
            if (nums[m] < target)
                l = m + 1;
 
            // If target is smaller, ignore right half
            else
                r = m - 1;
	}
        return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinarySearch_LeetCode704 b = new BinarySearch_LeetCode704();
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
			
		}
		int number=scanner.nextInt();
		int result= BinarySearch_LeetCode704.search(array,number);
		if(result==-1) {
			System.out.println("The element is not present");
		}else {
			System.out.println("The element is present at= "+result);
			scanner.close();
		}

	}

}
