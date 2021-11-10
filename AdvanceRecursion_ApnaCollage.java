package JavaDSAAlgo;


public class AdvanceRecursion_ApnaCollage {

	/*
	 * static void floodFill(int a[][], int r, int c, int tofill, int prevfill) {
	 * int row= a.length; int colm=a[0].length;
	 * 
	 * if(r<0 || r>=row || c<0 || c>=colm) { return; }
	 * 
	 * if(a[r][c]!= prevfill) { return; }
	 * 
	 * a[r][c]=tofill; floodFill(a, r-1, c, tofill, prevfill); floodFill(a, r, c-1,
	 * tofill, prevfill); floodFill(a, r+1, c, tofill, prevfill); floodFill(a, r,
	 * c+1, tofill, prevfill); }
	 * 
	 * 
	 * static void print(int a[][]) { for(int i=0;i<a.length;i++) { for(int
	 * j=0;j<a[i].length;j++) { System.out.print(a[i][j]+" "); }
	 * System.out.println(); } }
	 * 
	 */
	//public static void main(String[] args) {

		/*
		 * int a[][]= {{1,1,1,1,1,1,1,1}, {1,1,1,1,1,1,0,0}, {1,1,2,1,1,1,1,1},
		 * {1,1,2,1,1,0,1,1}, {1,1,1,2,1,1,1,1}, {1,1,0,1,1,2,1,1}, {1,1,1,1,1,1,1,2},
		 * {1,1,1,1,0,1,1,1},};
		 * 
		 * floodFill(a, 0, 0, 3, 1); print(a);
		 */

	//}
	
	static void printpermutation(String s, int l,int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		
		for(int i=l;i<=r;i++) {
			
			s = interChange(s, l, i);
			printpermutation(s, l+1, r);
			s = interChange(s, l, i);
		}
	}
	
	static String interChange(String s,int a,int b) {
		char array[]=s.toCharArray();
		char temp=array[a];
		array[b]=temp;
		return String.valueOf(array);
	}
	
	public static void main(String[] args) {
		
		printpermutation("abcd", 0, 3);
		
	}
}
