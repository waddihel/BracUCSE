//Task 6

import java.util.Scanner;

public class Task6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Divisors of " + n + ":");
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)
        System.out.println(i);
    }

    sc.close();
  }
}
