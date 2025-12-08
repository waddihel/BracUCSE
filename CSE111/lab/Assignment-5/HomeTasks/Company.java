public class Company {
  public String name = "ABC Company";
  public int empCount;
  public Employee[] emp = new Employee[3];
  public void addEmployee(Employee e) {
    if (empCount == emp.length)
      System.out.println("No more vacancy");
    else {
      System.out.println(e.name + " has joined the company");
      emp[empCount] = e;
      empCount++;
    }
  }
  public void removeEmployee(Employee e) {
    for (int i = 0; i < empCount; i++) {
      if (e == emp[i]) {
        System.out.println(e.name + " has left the company");
        empCount--;
      }
    }
  }
  public void details() {
    System.out.println("Company Name: " + name);
    System.out.println("Total Employee: " + empCount);
    System.out.println("Fulltime Employees: ");
    for (int i = 0; i < empCount; i++) {
      if ("Fulltime".equals(emp[i].type))
        System.out.println("Name: " + emp[i].name + " ID: " + emp[i].id);
    }
    System.out.println("Part-Time Employees: ");
    for (int i = 0; i < empCount; i++) {
      if ("Part-time".equals(emp[i].type))
        System.out.println("Name: " + emp[i].name + " ID: " + emp[i].id);
    }
  }
}

class Employee {
  public String name;
  public int id;
  public String type;
  Employee() { System.out.println("A default employee has been added"); }
  Employee(String n, int i, String t) {
    name = n;
    id = i;
    type = t;
  }
}
