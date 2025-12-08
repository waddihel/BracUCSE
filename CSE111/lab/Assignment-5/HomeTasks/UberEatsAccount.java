public class UberEatsAccount {
  public static void main(String[] args) {
    System.out.println("===========================");
    UberEatsUser user1 = new UberEatsUser("Peter Parker", "Badda");
    UberEatsUser user2 = new UberEatsUser("Matt Murdock", "Mohammadpur");
    UberEatsUser user3 = new UberEatsUser("Reed Richards");
    UberEatsUser user4 = new UberEatsUser("Peggy Carter", "Mirpur");
    Restaurant r1 = new Restaurant("Chillox", "Badda");
    r1.takeOrder(user1);
    r1.takeOrder(user2);
    r1.takeOrder(user3);
    r1.takeOrder(user4);
    r1.completeOrders();
    System.out.println("===========================");
    Restaurant r2 = new Restaurant("Kyoshi", "Gulshan");
    r2.takeOrder(user3);
    user3.updateLocation("Malibagh");
    user3.updateLocation("Bashundhara");
    r2.takeOrder(user3);
    r2.takeOrder(user3);
    r2.completeOrders();
    r2.completeOrders();
    System.out.println("===========================");
    Restaurant r3 = new Restaurant("Cilantro", "Banani");
    r3.takeOrder(user1);
    r3.takeOrder(user2);
    r3.takeOrder(user3);
    r3.takeOrder(user4);
  }
}
