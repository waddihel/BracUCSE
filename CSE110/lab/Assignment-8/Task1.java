// Task 1

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    System.out.println(isPrime(n));
    System.out.println(isPerfect(n));
    System.out.println(special_sum(n));
  }

  public static boolean isPrime(int n) {
    if (n == 2 || n == 3)
      return true;
    else if (n < 2 || n % 2 == 0 || n % 3 == 0)
      return false;
    else {
      for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
          return false;
      }
    }
    return true;
  }

  public static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i * 2 <= n; i++) {
      if (n % i == 0)
        sum += i;
    }
    if (sum == n)
      return true;
    else
      return false;
  }

  public static int special_sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (isPrime(i))
        sum += i;
      else if (isPerfect(i))
        sum += i;
    }
    return sum;
  }
}
