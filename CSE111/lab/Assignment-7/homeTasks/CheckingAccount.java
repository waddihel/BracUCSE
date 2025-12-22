// Task 2

public class CheckingAccount extends Account {
  public static int count;

  CheckingAccount() {
    super(0);
    count++;
  }

  CheckingAccount(double b) {
    super(b);
    count++;
  }
}
