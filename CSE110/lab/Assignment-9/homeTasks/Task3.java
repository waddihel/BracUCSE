// Task 3

public class Task3 {
  public static void main(String[] args) {
    int[] arr = {13, 12, 19, 21, 31, 55};
    int index = 0;

    print_element(arr, index);
  }

  public static void print_element(int[] arr, int index) {
    if (index == arr.length) {
    } else {
      System.out.println(arr[index]);
      print_element(arr, index + 1);
    }
  }
}
