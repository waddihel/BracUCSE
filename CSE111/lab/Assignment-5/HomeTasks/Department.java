public class Department {
  public String name;
  public int sCount;
  public Student[] std = new Student[5];
  Department(String n) { name = n; }
  public void addStudent(Student s) {
    for (int i = 0; i < sCount; i++) {
      if (s.id == std[i].id) {
        System.out.println("Student with the same ID already exists, Please "
                           + "try with another ID");
        return;
      }
    }
    std[sCount++] = s;
    System.out.println("Welcome to " + name + " department, " + s.name);
  }
  public void addStudent(Student s1, Student s2, Student s3) {
    addStudent(s1);
    addStudent(s2);
    addStudent(s3);
  }
  public void details() {
    System.out.println("Department name: " + name);
    System.out.println("Number of studnet: " + sCount);
    System.out.println("Details of the students:");
    for (int i = 0; i < sCount; i++) {
      System.out.println("Student name: " + std[i].name + ", ID: " + std[i].id +
                         ", cgpa: " + std[i].cgpa);
    }
  }
  public void findStudent(int id) {
    if (id < 0)
      System.out.println(
          "Student with this ID doesn't exist, Please give a valid ID");
    for (int i = 0; i < sCount; i++) {
      if (id == std[i].id) {
        System.out.println("Student info:");
        System.out.println("Student name: " + std[i].name);
        System.out.println("ID: " + std[i].id);
        System.out.println("CGPA: " + std[i].cgpa);
      }
    }
  }
}
class Student {
  public String name;
  public int id;
  public double cgpa;
  Student(String n, int i, double c) {
    name = n;
    id = i;
    cgpa = c;
  }
  public void updateId(int i) { id = i; }
}
