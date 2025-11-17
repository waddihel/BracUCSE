public class TravelPlan {
  public static void main(String[] args) {
    TravelPrep t1 = new TravelPrep();
    System.out.println("1==================");
    TravelPrep t2 = new TravelPrep("Package-2", 2100);
    System.out.println("2==================");
    TravelPrep d1 = new TravelPrep("Fushimi", "Shrine");
    TravelPrep d2 = new TravelPrep("Lake", "Kawaguchi", 550);
    TravelPrep d3 = new TravelPrep("Shrine", "Hieizan", 1000);
    TravelPrep d4 = new TravelPrep("Lake", "Ashi", 620);
    System.out.println("3==================");
    t2.add_to_itinerary(d1);
    t2.add_to_itinerary(d2, d3);
    t2.show_itinerary();
    System.out.println("4==================");
    System.out.println(d2.updateCost(60));
    System.out.println("5==================");
    t1.t_name = "Package-1";
    t1.add_to_itinerary(d2, d4);
    t1.add_to_itinerary(d3);
    System.out.println("6==================");
    t1.show_itinerary();
  }
}
