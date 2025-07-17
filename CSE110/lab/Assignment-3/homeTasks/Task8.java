//Task 8

import java.util.Scanner;

public class Task8{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int power10= 0;
      for(int i = 10; i<n;i*=10){power10 = i;}

      while(n>0){
         System.out.print((n/power10)+ ", ");
         n%=power10;
         power10/=10;
      }
   }
}
