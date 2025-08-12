// Task 5

import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Start: ");
    int start = sc.nextInt();
    System.out.print("End: ");
    int end = sc.nextInt();
    System.out.println("Armstrong numbers: ");
    for (int i = start; i <= end; i++) {
      int sum = 0;
      int digits = 0;
      for (int j = i; j > 0; j /= 10) {
        digits++;
      }
      for (int j = i; j > 0; j /= 10) {
        int raisedDigit = 1;
        for (int power = digits; power > 0; power--) {
          raisedDigit *= j % 10;
        }
        sum += raisedDigit;
      }
      if (sum == i)
        System.out.println(i);
    }
    sc.close();
  }
}
