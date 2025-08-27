// Task 5

public class Task5 {
  public static void main(String[] args) {

    int[] marks = {100, 47, 85, 94, 5, 50};
    String[] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};

    boolean swap = true;
    while (swap) {
      swap = false;
      for (int i = 0; i < marks.length - 1; i++) {
        if (marks[i] > marks[i + 1]) {
          int temp = marks[i];
          marks[i] = marks[i + 1];
          marks[i + 1] = temp;

          String tempS = names[i];
          names[i] = names[i + 1];
          names[i + 1] = tempS;

          swap = true;
        }
      }
    }

    for (int i = 0; i < marks.length; i++)
      System.out.print(marks[i] + " ");
    System.out.println();
    for (int i = 0; i < names.length; i++)
      System.out.print(names[i] + " ");
    System.out.println();
  }
}
