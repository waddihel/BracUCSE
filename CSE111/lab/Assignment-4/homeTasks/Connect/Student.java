// Task 3.1

public class Student {
  public String name;
  public int id;
  public String dep;
  public String email;
  public String password;
  public boolean login;
  public String courses = "";

  Student(String n, int i, String d) {
    name = n;
    id = i;
    dep = d;
    System.out.println("Student object is created");
  }
}
