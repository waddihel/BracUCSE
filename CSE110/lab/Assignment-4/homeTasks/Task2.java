//Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 1; i <= b; i++) {
      for (int j = 1; j <= a; j++) {
        System.out.print(j + " ");
      }
      System.out.println('\n');
    }
    sc.close();
  }
}
