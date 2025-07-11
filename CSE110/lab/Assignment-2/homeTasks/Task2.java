// Task 2
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter salary: ");
    int salary = sc.nextInt();
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    System.out.println();

    if (age < 18 || salary < 10000)
      System.out.println("Your tax amount is 0 TK");
    else if (salary >= 10000 && salary <= 20000)
      System.out.println("Your tax amount is " + salary * 0.05 + "TK");
    else
      System.out.println("Your tax amount is " + salary * 0.1 + "TK");
  }
}
