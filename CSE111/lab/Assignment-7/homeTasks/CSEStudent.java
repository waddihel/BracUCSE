//Task 5

public class CSEStudent extends Student {
  private static int sCount;
  private static String[] avCourses = { "CSE110", "CSE111", "CSE220", "CSE221" };

  CSEStudent(String n, int i) {
    super(n, i);
    sCount++;
  }

  public void addLabBasedCourse(String c) {
    for (int i = 0; i < 4; i++) {
      if (c.equals(avCourses[i])) {
        courses += avCourses[i] + " ";
        return;
      }
    }
    System.out.println("It is not a lab based course!");
  }

  public static void details() {
    System.out.println("Total CSE Students: " + sCount);
    System.out.println("Available Lab Based Courses:");
    for (int i = 0; i < 4; i++)
      System.out.print(avCourses[i] + " ");
    System.out.println();
  }
}
