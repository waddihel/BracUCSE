// Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    showDiamond(n);
  }

  public static void showDots(int n) {
    for (int i = 0; i < n; i++)
      System.out.print('.');
  }

  public static void showPalindrome(int n) {
    int i = 1;
    for (; i <= n; i++)
      System.out.print(i);

    for (i -= 2; i > 0; i--)
      System.out.print(i);
  }

  public static void showDiamond(int n) {
    int i = 1;
    for (; i <= n; i++) {
      showDots(n - i);
      showPalindrome(i);
      showDots(n - i);
      System.out.println();
    }

    for (i -= 2; i > 0; i--) {
      showDots(n - i);
      showPalindrome(i);
      showDots(n - i);
      System.out.println();
    }
  }
}
