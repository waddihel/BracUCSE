// Task 2

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    sc.close();

    boolean found = false;
    for (int i = 0; i < N; i++) {
      if (arr[i] == x) {
        System.out.println(x + " is at index " + i);
        found = true;
        break;
      }
    }
    if (!found)
      System.out.println("Element not found");
  }
}
