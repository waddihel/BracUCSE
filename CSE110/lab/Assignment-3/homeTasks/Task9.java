// Task 9

import java.util.Scanner;

public class Task9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    boolean isPrime = true;
    int sum = 0;

    if (n < 2)
      isPrime = false;
    else if (n == 2 || n == 3)
      isPrime = true;
    else if (n % 2 == 0 || n % 3 == 0)
      isPrime = false;
    else {
      for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime)
      System.out.println(n + " is a prime number");
    else
      System.out.println(n + " is not a prime number");
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        sum += i;
    }
    if (sum == n) {
      System.out.println(n + " is a perfect number");
    } else
      System.out.println(n + " is not a perfect number");
  }
}
