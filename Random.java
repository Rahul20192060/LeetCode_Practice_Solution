import java.util.*;

public class Random {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    int price[]=new int[a];

    int profit=0;
    int sum=0;
    for (int i = 0; i < price.length; i++) {
      price[i]=scanner.nextInt();
    }
    
    for (int i = 1; i < price.length; i++) {
       

      if(price[i]>price[i-1]){
        profit=price[i]-price[i-1];
        sum += profit;
      }
     
    }

    System.out.println(sum);

    scanner.close();
  }
  
}

