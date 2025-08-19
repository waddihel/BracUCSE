// Task 4

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String passWord = sc.nextLine();
    sc.close();

    int length = passWord.length();
    boolean hasCap = false, hasLow = false, hasNum = false, hasSym = false;

    for (int i = 0; i < length; i++) {
      int x = passWord.charAt(i);
      if (x >= 65 && x <= 90)
        hasCap = true;
      else if (x >= 97 && x <= 122)
        hasLow = true;
      else if (x >= 48 && x <= 57)
        hasNum = true;
      else
        hasSym = true;
    }

    System.out.println(hasCap && hasLow && hasNum && hasSym && (length >= 8));
  }
}
