public class Employee {
  public String name;
  public double salary = 30_000.0;
  public String designation = "junior";
  public void displayInfo() {
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + " Tk");
    System.out.println("Employee Designation: " + designation);
  }
  public void newEmployee(String n) { name = n; }
  public void calculateTax() {
    if (salary > 30_000) {
      if (salary > 50_000)
        System.out.println(name + " Tax Ammount: " + (salary * 0.3) + " Tk");
      else
        System.out.println(name + " Tax Ammount: " + (salary * 0.1) + " Tk");
    } else
      System.out.println("No need to pay tax");
  }
  public void promoteEmployee(String des) {
    if (des.equals("senior")) {
      designation = des;
      salary += 25_000;
      System.out.println(name + " has been promoted to " + des);
      System.out.println("New Salary: " + salary + " Tk");
    } else if (des.equals("lead")) {
      designation = des;
      salary += 50_000;
      System.out.println(name + " has been promoted to " + des);
      System.out.println("New Salary: " + salary + " Tk");
    } else if (des.equals("manager")) {
      designation = des;
      salary += 75_000;
      System.out.println(name + " has been promoted to " + des);
      System.out.println("New Salary: " + salary + " Tk");
    }
  }
}
