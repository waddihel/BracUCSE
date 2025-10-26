// Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a')
        System.out.print('z');
      else
        System.out.print((char)(str.charAt(i) - 1));
    }
    System.out.println();
  }
}
