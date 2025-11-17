// Task 4

public class TravelPrep {
  public String t_name;
  public int price;
  public TravelPrep[] itinerary = new TravelPrep[3];
  public int count;
  public int totalPrice;

  TravelPrep() { this("Unknown package", 1250); }
  TravelPrep(String n, int p) {
    t_name = n;
    price = p;
    System.out.println(t_name + " would cost at most " + price + " yen");
  }
  TravelPrep(String n1, String n2) { this(n1, n2, 300); }
  TravelPrep(String n1, String n2, int p) {
    t_name = n1 + n2;
    price = p;
    System.out.println(t_name + " costs " + price + " yen");
  }

  public void add_to_itinerary(TravelPrep t) {
    if ((totalPrice + t.price) > this.price) {
      System.out.println("Budget going overboard");
    } else {
      itinerary[count] = t;
      count++;
      totalPrice += t.price;
    }
  }
  public void add_to_itinerary(TravelPrep t1, TravelPrep t2) {
    add_to_itinerary(t1);
    add_to_itinerary(t2);
  }

  public String updateCost(int p) {
    price += p;
    return ("Cost of " + t_name + " updated to " + price);
  }

  public void show_itinerary() {
    System.out.println("Itinerary for " + t_name);
    for (int i = 0; i < count; i++) {
      System.out.println((i + 1) + "." + itinerary[i].t_name + " - " +
                         itinerary[i].price + " yen");
    }
    System.out.println("Total cost of " + count +
                       " destinations: " + totalPrice + " yen");
  }
}
