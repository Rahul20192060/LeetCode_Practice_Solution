import java.util.Scanner;

public class LeetCode1413 {

  public static int minStartValue(int[] nums){
    Integer min=0,sum=0;
        for(int i:nums){
            sum+=i;
            min=Math.min(min,sum);
        }
        return 1-min;
  }

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int []nums= new int[n];

    for (int i = 0; i < nums.length; i++) {
      nums[i]=sc.nextInt();
    }

    int ans=minStartValue(nums);
    System.out.println(ans);

    sc.close();
    
  }
  
}
