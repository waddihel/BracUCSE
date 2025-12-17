public class MarksTester {
  public static void main(String[] args) {
    System.out.println("Total Students: " + Student.total_students);
    System.out.println("Average Marks: " + Student.averageMarks());
    System.out.println("----------1----------");
    Student mike = new Student("Mike");
    mike.setCodingMarks(35);
    mike.setTracingMarks(10);
    mike.individualDetail();
    System.out.println("----------2----------");
    System.out.println("Total Students: " + Student.total_students);
    System.out.println("Average Marks: " + Student.averageMarks());
    System.out.println("----------3----------");
    Student eleven = new Student("Eleven", 70, 20);
    eleven.individualDetail();
    System.out.println("----------4----------");
    Student will = new Student("Will");
    will.setCodingMarks(51);
    will.individualDetail();
    System.out.println("----------5----------");
    System.out.println("Total Students: " + Student.total_students);
    System.out.println("Average Marks: " + Student.averageMarks());
  }
}


