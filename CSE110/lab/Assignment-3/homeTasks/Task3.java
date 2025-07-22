//Task 3

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    int countNonNeg = 0;
    int countNeg = 0;

    for (int i = 1; i <= n; i++) {
      System.out.print("Enter number " + i + ": ");
      int x = sc.nextInt();
      if (x >= 0)
        countNonNeg++;
      else if (x < 0)
        countNeg++;
    }
    System.out.println(countNonNeg + " Non-negative Numbers");
    System.out.println(countNeg + " Negative Numbers");

    sc.close();
  }
}
