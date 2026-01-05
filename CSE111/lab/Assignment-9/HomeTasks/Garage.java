public class Garage {
  public int cCount;
  public int bCount;
  public Car[] cars;
  public Bike[] bikes;

  Garage(int c, int b) {
    cars = new Car[c];
    bikes = new Bike[b];
    System.out.println("Welcome to the Garage!");
    System.out.println("Car Capacity: " + c);
    System.out.println("Bike Capacity: " + b);
  }

  public void addVehicle(Vehicle v) {
    if (v instanceof Car) {
      if (cCount == cars.length)
        System.out.println("Can't add more Cars! Capacity: " + cars.length);
      else {
        cars[cCount++] = (Car)v;
        System.out.println("A " + v.getBrand() +
                           " CAR has been added to the garage");
      }
    } else if (v instanceof Bike) {
      if (bCount == bikes.length)
        System.out.println("Can't add more Bikes! Capacity: " + bikes.length);
      else {
        bikes[bCount++] = (Bike)v;
        System.out.println("A " + v.getBrand() +
                           " BIKE has been added to the garage");
      }
    }
  }
}

class Car extends Vehicle {
  public String model;
  public int doors;
  public boolean ai;

  Car(String b, String m, int y, int d, int w, boolean a) {
    super(b, y);
    model = m;
    doors = d;
    ai = a;
    setWheels(w);
  }

  public void startAutoPilot() {
    if (!ai)
      System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
    else
      System.out.println(getBrand() + ":" + model + " AutoPilot started");
  }

  public String toString() {
    return super.toString() + ", Model: " + model + ", Doors: " + doors +
        ", AI: " + ai;
  }
}

class Bike extends Vehicle {
  public String model;
  public boolean sideCar;

  Bike(String b, String m, int y, int w, boolean s) {
    super(b, y);
    model = m;
    sideCar = s;
    setWheels(w);
  }

  public void doAWheelie() {
    if (sideCar)
      System.out.println("Wheelie failed. " + getBrand() + ":" + model +
                         " has SideCar");
    else
      System.out.println(getBrand() + ":" + model + " is doing a Wheelie!!");
  }

  public String toString() {
    return super.toString() + ", Model: " + model + ", SideCar: " + sideCar;
  }
}
