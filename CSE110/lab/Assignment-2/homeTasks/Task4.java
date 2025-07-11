// Task 4
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the three sides of a triangle: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    sc.close();

    if (a == b && b == c && c == a)
      System.out.println("This is an Equilateral triangle");
    else if (a == b || b == c || c == a)
      System.out.println("This is an Isoceles triangle");
    else
      System.out.println("This is an Scalene triangle");
  }
}
