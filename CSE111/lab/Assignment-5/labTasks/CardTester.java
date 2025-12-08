public class CardTester {
  public static void main(String[] args) {
    System.out.println("1-----------------");
    MFS bkash = new MFS("12121212");
    System.out.println("2-----------------");
    Card visaCard = new Card(2000, "VISA");
    System.out.println("3-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("4-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
    System.out.println("5-----------------");
    bkash.addNewCard(visaCard);
    System.out.println("6-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("7-----------------");
    bkash.addMoneyFromCard(800);
    System.out.println("8-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
  }
}
