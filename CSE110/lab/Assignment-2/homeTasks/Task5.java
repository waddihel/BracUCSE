// Task 5
import java.util.Scanner;

public class Task5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");

    int total_amount = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka)");

    int paid_amount = sc.nextInt();
    int return_amount = paid_amount - total_amount;

    int note100 = 0;
    int note50 = 0;
    int note20 = 0;
    int note10 = 0;
    int coin5 = 0;
    int coin2 = 0;
    int coin1 = 0;

    sc.close();

    if (total_amount == paid_amount)
      System.out.println("The returned amount is 0 taka");

    if (total_amount < paid_amount) {
      System.out.println("The returned amount is " + return_amount + "taka");
      if (return_amount >= 100) {
        note100 = return_amount / 100;
        return_amount -= 100 * note100;
      }
      if (return_amount >= 50) {
        note50 = return_amount / 50;
        return_amount -= 50 * note50;
      }
      if (return_amount >= 20) {
        note20 = return_amount / 20;
        return_amount -= 20 * note20;
      }
      if (return_amount >= 10) {
        note10 = return_amount / 10;
        return_amount -= 10 * note10;
      }
      if (return_amount >= 5) {
        coin5 = return_amount / 5;
        return_amount -= 5 * coin5;
      }
      if (return_amount >= 2) {
        coin2 = return_amount / 2;
        return_amount -= 2 * coin2;
      }
      if (return_amount >= 1) {
        coin1 = return_amount / 1;
        return_amount -= 1 * coin1;
      }
      System.out.println("100 taka note: " + note100);
      System.out.println("50 taka note: " + note50);
      System.out.println("20 taka note: " + note20);
      System.out.println("10 taka note: " + note10);
      System.out.println("5 taka note: " + coin5);
      System.out.println("2 taka coin: " + coin2);
      System.out.println("1 taka coin: " + coin1);
    }
    if (total_amount > paid_amount)
      System.out.println("Please pay " + (total_amount - paid_amount) +
                         " taka more.");
  }
}
