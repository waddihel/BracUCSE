// Task 3.2

public class Connect {
  public int totalAdvisee;
  public Student[] students = new Student[5];

  Connect() { System.out.println("Connect is ready to use!"); }

  public void login(Student s) {
    if (s.email == null || s.password == null) {
      System.out.println("Email and password need to be set.");
    } else {
      s.login = true;
      System.out.println("Login successful");
    }
  }

  public void advising(Student s) {
    if (s.login) {
      System.out.println("You haven't selected any courses.");
    } else {
      System.out.println("Please login to advise courses!");
    }
  }
  public void advising(Student s, String c1, String c2, String c3, String c4) {
    if (s.login) {
      System.out.println(
          "You need special approval to take more than 3 courses.");
    } else {
      System.out.println("Please login to advise courses!");
    }
  }
  public void advising(Student s, String c1, String c2, String c3) {
    if (s.login) {
      s.courses = c1 + " " + c2 + " " + c3;
      students[totalAdvisee] = s;
      totalAdvisee++;
      System.out.println("Advising successful!");
    } else {
      System.out.println("Please login to advise courses!");
    }
  }

  public void allAdviseeInfo() {
    System.out.println("Total Advisee: " + totalAdvisee);
    for (int i = 0; i < totalAdvisee; i++) {
      System.out.println("Name: " + students[i].name + "ID: " + students[i].id);
      System.out.println("Department: " + students[i].dep);
      System.out.println("Advised Courses:\n" + students[i].courses);
      System.out.println("==============");
    }
  }
}
