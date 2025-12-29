import java.util.Arrays;
public class PathaoRideManager {
  public static void main(String[] args) {
    System.out.println("1.==============");
    GenericDriver d = new GenericDriver();
    System.out.println("2.==============");
    d.hasSafetyTraining();
    System.out.println("3.==============");
    BikeDriver d1 = new BikeDriver("John", "Not Premium");
    System.out.println("4.==============");
    System.out.println(d1);
    System.out.println("5.==============");
    System.out.println(d1.acceptRide(false));
    System.out.println("6.==============");
    d1.hasSafetyTraining();
    System.out.println("7.==============");
    CarDriver d2 = new CarDriver("Max");
    System.out.println("8.==============");
    System.out.println(d2);
    System.out.println("9.==============");
    d2.hasSafetyTraining();
    System.out.println("10.==============");
    System.out.println(d2.acceptRide(true));
    System.out.println("11.==============");
    System.out.println(d2);
    System.out.println("12.==============");
    BikeDriver.restrictedAreas("Airport Road");
    BikeDriver.restrictedAreas("Defense Area");
    BikeDriver.restrictedAreas("Navy Base");
    System.out.println(Arrays.toString(BikeDriver.restrictedAreas));
    System.out.println("13.==============");
    d1.fightRestriction(new String[] {"Defense Area", "Banani", "Uttara"});
    System.out.println("14.==============");
    CarDriver.restrictedAreas("Cantonment");
    CarDriver.restrictedAreas("Road 27");
    System.out.println(Arrays.toString(CarDriver.restrictedAreas));
    System.out.println("15.==============");
    d2.fightRestriction(new String[] {"Defense Area", "Road 27"});
  }
}

class GenericDriver {
  private String name;
  public GenericDriver() { System.out.println("Welcome to Pathao!"); }
  public GenericDriver(String name) {
    this.name = name;
    System.out.println("Welcome to Pathao Driver Panel!");
    System.out.println(this.name + (" has been registered as a Pathao "
                                    + "driver!"));
  }
  public String getName() { return name; }
  public void hasSafetyTraining() {
    System.out.println("All drivers must have safety training.");
  }
  public String acceptRide(boolean hasVehicle) {
    String s = "All Pathao drivers can accept rides. ";
    if (!hasVehicle)
      s += "Driver does not have a verified vehicle. ";
    else
      s += "Driver has a verified vehicle. ";
    return s;
  }
}
