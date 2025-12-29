// Task 4

public class Car extends Vehicle {
  public static int count;
  public static Car[] allCar = new Car[3];
  public int seat;

  Car(String m, int p, int s) {
    super(m, p);
    seat = s;
    allCar[count] = this;
    vehicleId = "CAR00" + (++count);
    System.out.println("Vehicle ID: " + vehicleId + " created");
  }
  public void vehicleDetail() {
    super.vehicleDetail();
    System.out.println("Type: Regular Car");
    System.out.println("Seats: " + seat);
  }

  public static void showAllCars() {
    System.out.println("Total Car: " + count);
    for (int i = 0; i < count; i++) {
      if (allCar[i] == null)
        break;
      System.out.println(allCar[i].vehicleId + " : " + allCar[i].model +
                         (allCar[i].sold ? "- sold" : "- available"));
    }
  }

  public static void showAllAvailableCars() {
    System.out.println("Total Car: " + count);
    System.out.println("Available cars:");
    for (int i = 0; i < count; i++) {
      if (!allCar[i].sold)
        System.out.println(allCar[i].vehicleId + " : " + allCar[i].model);
    }
  }

  public static void markAsSold(Car c) { c.sold = true; }
}
class ElectricCar extends Vehicle {
  public static int count;
  public static ElectricCar[] allCar = new ElectricCar[3];
  public int bCap;

  ElectricCar(String m, int p, int s) {
    super(m, p);
    bCap = s;
    allCar[count++] = this;
    vehicleId = "EV000";
    System.out.println("Vehicle ID: " + vehicleId + " created");
  }
  public void vehicleDetail() {
    super.vehicleDetail();
    System.out.println("Type: Electric Vehicle");
    System.out.println("Battery Capacity: " + bCap + " kWh");
  }

  public static void showAllCars() {
    System.out.println("Total Car: " + count);
    for (int i = 0; i < count; i++) {
      if (allCar[i] == null)
        break;
      System.out.println(allCar[i].vehicleId + " : " + allCar[i].model +
                         (allCar[i].sold ? "- sold" : "- available"));
    }
  }

  public static void showAllAvailableCars() {
    System.out.println("Total Car: " + count);
    System.out.println("Available cars:");
    for (int i = 0; i < count; i++) {
      if (allCar[i] == null)
        break;
      System.out.printf(allCar[i].vehicleId + " : " + allCar[i].model);
    }
  }

  public static void markAsSoldEV(ElectricCar c) { c.sold = true; }
}
