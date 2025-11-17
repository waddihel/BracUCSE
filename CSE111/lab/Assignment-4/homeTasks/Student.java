// Task 2

public class Student {
  public int id;
  public double cg;
  public String[] course;
  public int count = 0;

  Student(int i) {
    id = i;
    System.out.println("A student with ID " + id + " has been created.");
  }
  Student(int i, double c) {
    id = i;
    storeCG(c);
    System.out.println("A student with ID " + id + " and CGPA: " + cg +
                       " has been created.");
  }
  public void storeCG(double c) {
    cg = c;
    course = new String[((c < 3.0) ? 3 : 4)];
  }
  public void addCourse(String c) {
    if (cg == 0.0) {
      System.out.println("Failed to add " + c);
      System.out.println("Set CG first");
      return;
    }
    if (count == course.length) {
      System.out.println("Failed to add " + c);
      if (course.length == 3)
        System.out.println("CG is low can't. add more than 3 courses.");
      else
        System.out.println("Maximum 4 courses allowed");
    } else {
      course[count] = c;
      count++;
    }
  }
  public void addCourse(String[] c) {
    for (int i = 0; i < c.length; i++) {
      addCourse(c[i]);
    }
  }
  public void showAdvisee() {
    System.out.printf("Student ID: %d, CGGA: %.1f\n", id, cg);
    if (count == 0)
      System.out.println("No courses added.");
    else {
      System.out.println("Added courses are: ");
      for (int i = 0; i < count; i++) {
        System.out.print(course[i] + " ");
      }
      System.out.println();
    }
  }
  public void removeAllCourse() {
    storeCG(cg);
    count = 0;
  }
  public void storeID(int i) { id = i; }
}
