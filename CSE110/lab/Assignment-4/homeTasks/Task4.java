//Task 4

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of Customer: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("Item number for Customer-" + i + ": ");
      int k = sc.nextInt();
      double average = 0;
      int sum = 0;

      for (int j = 1; j <= k; j++) {
        System.out.print("Item-" + j + ": ");
        int price = sc.nextInt();

        sum += price;
        average = (double) sum / k;
      }
      System.out.println("Average for Customer-" + i + ": " + average);
    }
    sc.close();
  }
}
