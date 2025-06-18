public class Swap {

  public static void main(String[] args) {
    int x = 5;
    int y = 10;
    System.out.println("The value of x and y respectively before swaping: " + x + " and " + y);

    // Using arithmetic operations to swap the variables
    // x = x + y;
    // y = x - y;
    // x = x - y;
    // System.out.println("The value of x and y respectively after swaping: " + x +
    // " and " + y);

    // Alternatively: using the bitwise operator XOR to swap the variables
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("The value of x and y respectively after swaping: " + x + " and " + y);

  }
}
