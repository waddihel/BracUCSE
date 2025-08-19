// Task 3

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase();
    sc.close();

    boolean makeLower = true;

    for (int i = 0; i < s.length(); i++) {
      char x = s.charAt(i);
      if ((int)x >= 65 && (int)x <= 90) {
        if (makeLower) {
          System.out.print((char)(x + 32));
          makeLower = false;
        } else {
          System.out.print(x);
          makeLower = true;
        }
      } else
        System.out.print(x);
    }
  }
}
