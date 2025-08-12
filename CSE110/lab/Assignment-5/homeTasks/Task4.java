import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++)
        System.out.print(" ");
      for (int j = 1; j < i * 2; j++)
        if (j == 1 || j == i * 2 - 1)
          System.out.print(j);
        else
          System.out.print(" ");
      System.out.println();
    }
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(" ");
      for (int j = 1; j < (n - i) * 2; j++)
        if (j == 1 || j == (n - i) * 2 - 1)
          System.out.print(j);
        else
          System.out.print(" ");
      System.out.println();
    }
  }
}
