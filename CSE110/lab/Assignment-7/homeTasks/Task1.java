// Task 1

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N= ");
    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    System.out.println("Original array: ");
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < N; i++) {
      if (arr[i] > 0)
        arr[i] = 1;
      else
        arr[i] = 0;
    }

    System.out.println("After modifying: ");
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
