import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    while (true) {
      int count = 0;
      for (int i = 0; i < N - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          arr[i] = arr[i] ^ arr[i + 1];
          arr[i + 1] = arr[i] ^ arr[i + 1];
          arr[i] = arr[i] ^ arr[i + 1];
          count++;
        }
      }
      if (count == 0)
        break;
    }

    for (int i = 0; i < N;) {
      int x = arr[i];
      int count = 1;
      for (int j = i + 1; j <= N; j++) {
        if (i == N - 1) {
          System.out.println(x + " - " + count + " times");
          i++;
          break;
        } else if (j == N || x != arr[j]) {
          i = j;
          System.out.println(x + " - " + count + " times");
          break;
        }
        count++;
      }
    }
  }
}
