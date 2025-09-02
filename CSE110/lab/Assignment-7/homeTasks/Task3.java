// Task 3

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int N = sc.nextInt();
    double[] arr = new double[N];
    for (int i = 0; i < N; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextDouble();
    }
    sc.close();

    double max = arr[0];
    double min = arr[0];
    int maxIdx = 0, minIdx = 0;
    double sum = 0;
    double avg;

    for (int i = 0; i < N; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIdx = i;
      } else if (arr[i] < min) {
        min = arr[i];
        minIdx = i;
      }
      sum += arr[i];
    }
    avg = sum / N;

    System.out.println("Maximum element " + max + " found at index " + maxIdx);
    System.out.println("Minimum element " + min + " found at index " + minIdx);
    System.out.println("Summation: " + sum);
    System.out.println("Average: " + avg);
  }
}
