// Task 3

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    calcYearlyTax();
  }

  public static double calcTax(int age, int salary) {
    if (age < 18 || salary < 10_000)
      return 0;
    else if (salary >= 10_000 && salary <= 20_000)
      return salary * 0.07;
    else
      return salary * 0.14;
  }

  public static void calcYearlyTax() {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double totalYearlyTax = 0;
    for (int i = 1; i <= 12; i++) {
      int salary = sc.nextInt();
      double tax = calcTax(age, salary);
      System.out.printf("Month%d tax: %.1f\n", i, tax);
      totalYearlyTax += tax;
    }
    sc.close();
    System.out.printf("Total Yearly Tax %.1f\n", totalYearlyTax);
  }
}
