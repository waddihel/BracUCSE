// Task 6
import java.util.Scanner;

public class Task6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input the 1st number: ");
    int a = sc.nextInt();
    System.out.print("Input the 2nd number: ");
    int b = sc.nextInt();
    System.out.print("Input the 3rd number: ");
    int c = sc.nextInt();

    sc.close();

    if (a == b && b == c && c == a)
      System.out.println("All numbers are equal");
    else if (a == b || b == c || c == a)
      System.out.println("Neither all are equal or different");
    else
      System.out.println("All numbers are different");
  }
}
