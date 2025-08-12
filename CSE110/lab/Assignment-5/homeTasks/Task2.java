// Task 2
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++)
        if (j <= n - i || (!(i == 1 || i == n) && !(j == n - i + 1 || j == n)))
          System.out.print(" ");
        else
          System.out.print(j);
      System.out.println();
    }
  }
}
