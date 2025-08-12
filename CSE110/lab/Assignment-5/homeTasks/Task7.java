// Task 7
import java.util.Scanner;

public class Task7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = n / 2 + 1; i > 0; i--) {
      for (int j = 1; j <= n / 2 + 1 - i; j++)
        System.out.print(" ");
      for (int j = 1; j < i * 2; j++)
        System.out.print(j);
      System.out.println();
    }

    for (int i = 2; i <= n / 2 + 1; i++) {
      for (int j = 1; j <= n / 2 + 1 - i; j++)
        System.out.print(" ");
      for (int j = 1; j < i * 2; j++)
        System.out.print(j);
      System.out.println();
    }
  }
}
