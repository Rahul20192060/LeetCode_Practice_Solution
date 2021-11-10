package JavaDSAAlgo;

import java.util.Scanner;

public class fibonachi {
	
	static int Fibonachi_Number(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return Fibonachi_Number(n-1)+ Fibonachi_Number(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: "+" ");
		int x=scanner.nextInt();
		System.out.print("0"+" "+"1"+" ");
		for(int i=1;i<=x;i++) {
			System.out.print(Fibonachi_Number(i)+" ");
		}

	}

}
