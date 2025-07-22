// Task 7

import java.util.Scanner;

public class Task7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (; n > 0; n /= 10) {
      System.out.print((n % 10) + ", ");
    }

    sc.close();
  }
}
