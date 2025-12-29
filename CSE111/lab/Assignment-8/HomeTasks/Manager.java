// Task 5

public class Manager extends Employee {
  public double bonus;
  public double finalSalary;

  Manager(String n, double s, int h, double b) {
    super(n, s, h);
    bonus = b;
  }

  public void calculateSalary() {
    if (getHoursWorked() > 40)
      finalSalary = getBaseSalary() + getBaseSalary() * (bonus / 100);
    else
      finalSalary = getBaseSalary();
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.printf("Bonus: %.1f %%\n", bonus);
    System.out.printf("Final Salary $%.1f\n", finalSalary);
  }

  public void requestIncrement(double s) {
    if (getHoursWorked() > 100) {
      System.out.printf("$%d increment approved\n", s);
      setBaseSalary(getBaseSalary() + s);
    } else if (getHoursWorked() > 80) {
      s /= 2;
      System.out.printf("$%.1f increment approved\n", s);
      setBaseSalary(getBaseSalary() + s);
    } else
      System.out.println("Increment denied.");
  }
}
class Developer extends Employee {
  public String language;
  public double finalSalary;

  Developer(String n, double s, int h, String l) {
    super(n, s, h);
    language = l;
  }

  public void calculateSalary() {
    if (language.equals("Java"))
      finalSalary = getBaseSalary() + 700;
    else
      finalSalary = getBaseSalary();
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.printf("Language: %s \n", language);
    System.out.printf("Final Salary $%.1f\n", finalSalary);
  }
}
