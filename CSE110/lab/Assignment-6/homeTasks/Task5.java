// Task 5

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String usr = sc.nextLine(), pass = sc.nextLine();
    sc.close();

    int passLength = pass.length(), usrLength = usr.length();
    boolean hasName = true;

    for (int i = 0; i + usrLength <= passLength; i++) {
      hasName = true;
      for (int j = 0; j < usrLength; j++) {
        if (pass.charAt(i + j) != usr.charAt(j)) {
          hasName = false;
          break;
        }
      }
      if (hasName)
        break;
    }

    if (hasName) {
      System.out.println("Invalid");
    } else
      System.out.println("Valid");
  }
}
