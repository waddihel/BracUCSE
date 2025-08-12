// Task 6
import java.util.Scanner;

public class Task6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= n - i; j++)
        System.out.print(" ");
      int k = 1;
      for (; k <= i; k++)
        System.out.print(k);
      for (k -= 2; k > 0; k--)
        System.out.print(k);
      System.out.println();
    }
  }
}
