public class AccountTester {
  public static void main(String[] args) {
    System.out.print("All accounts belong to ");
    System.out.println(Account.bankName);
    System.out.println("Accounts created: " + Account.count);
    System.out.print("Total Money stored ");
    System.out.println(Account.totalBalance + " taka");
    System.out.println("1---------------------------------");
    Account a1 = new Account("Abir", "Dhanmondi");
    System.out.println("2---------------------------------");
    a1.printInfo();
    System.out.println("3---------------------------------");
    Account a2 = new Account("Mira", "Mirpur");
    a2.printInfo();
    System.out.println("4---------------------------------");
    a1.setBalance(1000);
    System.out.println("5---------------------------------");
    a1.printInfo();
    a2.setBalance(2000);
    System.out.println("6---------------------------------");
    System.out.println(a2.getBalance());
    System.out.println("7---------------------------------");
    a2.setBalance(500);
    System.out.println("8---------------------------------");
    a2.printInfo();
    System.out.println("9---------------------------------");
    System.out.print("All accounts belong to ");
    System.out.println(Account.bankName);
    System.out.println("Accounts created: " + Account.count);
    System.out.print("Total Money stored ");
    System.out.println(Account.totalBalance + " taka");
  }
}

