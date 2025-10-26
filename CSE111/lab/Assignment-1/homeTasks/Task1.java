// Task 1

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(), y = sc.nextInt();
    if (x > y) {
      x = x ^ y;
      y = x ^ y;
      x = x ^ y;
    }
    int primeCount = 0;
    for (int j = x; j < y; j++) {
      boolean isPrime = true;
      for (int i = 2; i * i <= j && j != 2; i++) {
        if (j % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime)
        primeCount++;
    }
    System.out.println("There are " + primeCount + " prime numbers between " +
                       x + " and " + y);
  }
}
