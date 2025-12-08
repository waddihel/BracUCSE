public class UberEatsUser {
  public String name;
  public String location;

  UberEatsUser(String n, String l) {
    name = n;
    location = l;
  }
  UberEatsUser(String n) { this(n, "Unknown"); }
  public void updateLocation(String l) {
    if ("Unknown".equals(location)) {
      System.out.println("Update successful!");
      location = l;
    } else
      System.out.println(
          "We already have your location. Please place an order!");
  }
}

class Restaurant {
  public String name;
  public String location;
  public UberEatsUser[] orders = new UberEatsUser[3];
  public int oCount;

  Restaurant(String n, String l) {
    name = n;
    location = l;
  }

  public void takeOrder(UberEatsUser u) {
    if ("Unknown".equals(u.location))
      System.out.println(
          "Location : Unknown. Please update your location information!");
    else if (oCount == 3)
      System.out.println("We are really busy right now. Please order after "
                         + "some time. Thank you!");
    else {
      for (int i = 0; i < oCount; i++) {
        if (orders[i] == u) {
          System.out.println("You already have a pending order!");
          return;
        }
      }
      System.out.println("Your order has been added!");
      orders[oCount++] = u;
    }
  }
  public void completeOrders() {
    if (oCount == 0)
      System.out.println("No pending orders at the moment.");
    else {
      System.out.println("Showing " + name + "'s orders:");
      for (int i = 0; i < oCount; i++) {
        System.out.println("Order by " + orders[i].name + " at " +
                           orders[i].location + " completed");
      }
      oCount = 0;
    }
  }
}
