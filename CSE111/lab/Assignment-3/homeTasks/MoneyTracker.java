// Task 4

public class MoneyTracker {
  public String name;
  public double balance;
  public double lSpent;
  public double lAdded;
  MoneyTracker() {
    System.out.println("A new money tracker has been launched.");
  }
  public String info() {
    return ("Name: " + name + "\nCurrent balance: " + balance);
  }
  public void createTracker(String n) {
    name = n;
    balance = 1.0;
  }
  public void income(double i) {
    balance += i;
    lAdded = i;
    System.out.println("Balance Updated!");
  }
  public void expense(double e) {
    if (e > balance) {
      System.out.println("Not enough balance.");
    } else {
      balance -= e;
      lSpent = e;
      if (balance == 0.0)
        System.out.println("You're broke!");
      else
        System.out.println("Balance updated.");
    }
  }
  public void showHistory() {
    System.out.println("Last added: " + lAdded);
    System.out.println("Last spent: " + lSpent);
  }
}
