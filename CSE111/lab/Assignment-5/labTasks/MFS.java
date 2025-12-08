public class MFS {
  public String ac;
  public double balance;
  public Card card;
  MFS(String a) {
    ac = a;
    System.out.println("Account created");
    System.out.println("AccNo: " + ac);
    System.out.println("Balance: " + balance);
    System.out.println("Card not saved");
  }
  public void addMoneyFromCard(double amm) {
    if (card == null) {
      System.out.println("Please add a card to your MFS account");
    } else {
      if (amm > card.balance) {
        System.out.println("Insufficient balance in " + card.name + " card");
      } else {
        balance += amm;
        card.balance -= amm;
        System.out.println("Transfer successful");
        System.out.println("New MFS balance: " + balance + " tk");
        System.out.println("Card balance: " + card.balance + " tk");
      }
    }
  }
  public void addNewCard(Card c) {
    card = c;
    System.out.println(card.name + " card added to MFS acc#" + ac);
  }
}
class Card {
  public String name;
  public double balance;
  Card(double b, String n) {
    name = n;
    balance = b;
    System.out.println(name + " card added successfully.");
    System.out.println("Balance: " + balance + " tk.");
  }
  public void addMoneyFromAccount(double b, MFS a) {
    if (b > a.balance) {
      System.out.println("Insufficient account balance.");
    } else {
      a.balance -= b;
      balance += b;
      System.out.println("Added " + b + " tk to from MFS account#" + a.ac);
      System.out.println("New balance in card: " + balance + " tk");
    }
  }
}
