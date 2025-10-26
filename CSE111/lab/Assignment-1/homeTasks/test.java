import java.util.Scanner;
public class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] array = new int[n];
    int[] array2 = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    int current_num = array[0];
    boolean flag = false;

    for (int i = 0; i < array.length; i++) {
      int i_counter = 1;
      for (int k = 0; k < array2.length; k++) {
        if (current_num == array2[k]) {
          flag = true;
          break;
        }
      }
      if (flag == true) {
        flag = false;
        continue;
      }
      for (int j = 0; j < array.length; j++) {
        if (j == i) {
          continue;
        }

        if (array[j] == current_num) {
          i_counter++;
          array2[j] = current_num;
        }
        if (j == array.length - 1) {
          System.out.print(current_num + "-" + i_counter + " times");
          System.out.println();
        }
      }
      current_num = array[i + 1];
    }
  }
}
