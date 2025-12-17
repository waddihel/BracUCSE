// Task 4
public class Animalkeepers {
  public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
  public static String[] tasks = new String[Animals.length];
  private static int kCount;
  private static int tCount;
  private String name;
  private int id;

  Animalkeepers(String n) {
    name = n;
    id = 100 + (++kCount);
    System.out.println(name + " with ID " + id + " got the job!");
  }

  public void doTask(String n, String t) {
    for (int i = 0; i < Animals.length; i++) {
      if (n.equals(Animals[i])) {
        if (tasks[i] == null)
          tCount++;
        tasks[i] = t + " (Keeper - " + name + ") === " + Animals[i];
        System.out.println("Task assigned to " + name);
        return;
      }
    }
    System.out.println("Animal not in the Safari");
  }

  public static void printTasks() {
    if (tCount == 0)
      System.out.println("No tasks assigned.");
    else {
      for (int i = 0; i < tasks.length; i++) {
        if (tasks[i] != null)
          System.out.println(tasks[i]);
      }
    }
  }
  public static void details() {
    if (kCount == 0)
      System.out.println("No Animal Keepers working yet.");
    else if (tCount == 0)
      System.out.println("No tasks assigned.");
    else {
      System.out.println("Total Animal Keeper: " + kCount);
      System.out.println("Total Task assigned: " + tCount);
      printTasks();
    }
  }
}
