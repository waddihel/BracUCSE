// Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();
    sc.close();

    System.out.println(power(base, exp));
  }

  public static int power(int base, int exp) {
    if (exp == 0)
      return 1;
    return base * power(base, exp - 1);
  }
}
