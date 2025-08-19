// Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine().toUpperCase();
    String s2 = sc.nextLine().toUpperCase();
    sc.close();

    for (int i = 0; i < s1.length(); i++) {
      boolean match = false;
      for (int j = 0; j < s2.length(); j++) {
        if (s1.charAt(i) == s2.charAt(j)) {
          match = true;
          break;
        }
      }
      if (!match)
        System.out.print(s1.charAt(i));
    }
    for (int i = 0; i < s2.length(); i++) {
      boolean match = false;
      for (int j = 0; j < s1.length(); j++) {
        if (s1.charAt(j) == s2.charAt(i)) {
          match = true;
          break;
        }
      }
      if (!match)
        System.out.print(s2.charAt(i));
    }
  }
}
