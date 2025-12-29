// Task 2

public class Concert {
  public String name;
  public String time;
  public String artists;
  public int aCount;
  public int tSold;
  public static int tTsold;

  Concert(String n, String t) {
    name = n;
    time = t;
    artists = "";
  }

  public void addArtist(String n) {
    artists += "\n-" + n;
    aCount++;
  }

  public void showDetails() {
    System.out.println("Venue: " + name);
    System.out.println("Showtime: " + time);
    System.out.println("Artists: " + artists);
    System.out.println("Tickets sold in this concert: " + tSold);
  }

  public void buyTicket(String z, int q) {
    tSold += q;
    tTsold += q;
    if (z.equals("A"))
      System.out.println("Total price: " + (q * 500));
    else if (z.equals("B"))
      System.out.println("Total price: " + (q * 1000));
  }
  public void buyTicket(String z) { buyTicket(z, 1); }

  public static void showTotalTicketsSold() {
    System.out.println("Total tickets sold (all venues): " + tTsold);
  }
}

class VIPConcert extends Concert {
  VIPConcert(String n, String t) { super(n, t); }
  public void buyTicket() {
    tSold += 1;
    tTsold += 1;
    System.out.println("Total price: " + 2000);
  }
}
