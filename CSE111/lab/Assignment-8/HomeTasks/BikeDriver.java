// Task 3

public class BikeDriver extends GenericDriver {
  public String tier;
  public static String[] restrictedAreas = new String[3];
  public static int rCount;

  BikeDriver(String n, String t) {
    super(n);
    tier = t;
  }

  public String toString() {
    return getName() + (tier.equals("Not Premium")
                            ? ("'s driver profile is not Premium")
                            : ("'s driver profile is a Premium"));
  }

  public String acceptRide(boolean h) {
    return super.acceptRide(h) + "\n" + toString();
  }

  public void hasSafetyTraining() {
    super.hasSafetyTraining();
    if (tier.equals("Premium"))
      System.out.println("Premium drivers receive extra safety briefings.");
  }

  public static void restrictedAreas(String r) {
    restrictedAreas[rCount++] = r;
  }

  public void fightRestriction(String[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean restricted = false;
      for (int j = 0; j < 3; j++) {
        if (a[i].equals(restrictedAreas[j])) {
          restricted = true;
          System.out.println(getName() + " cannot enter " + a[i] + " area");
        }
      }
      if (!restricted)
        System.out.println(getName() + " can enter " + a[i] + " area");
    }
  }
}
class CarDriver extends GenericDriver {
  public String tier;
  public static String[] restrictedAreas = new String[2];
  public static int rCount;

  CarDriver(String n) {
    super(n);
    tier = "Premium";
  }

  public String toString() {
    return getName() + (tier.equals("Not Premium")
                            ? ("'s driver profile is not Premium")
                            : ("'s driver profile is a Premium"));
  }

  public String acceptRide(boolean h) {
    return super.acceptRide(h) + "\n" + toString();
  }

  public void hasSafetyTraining() {
    super.hasSafetyTraining();
    if (tier.equals("Premium"))
      System.out.println("Premium drivers receive extra safety briefings.");
  }

  public static void restrictedAreas(String r) {
    restrictedAreas[rCount++] = r;
  }

  public void fightRestriction(String[] a) {
    for (int i = 0; i < a.length; i++) {
      boolean restricted = false;
      for (int j = 0; j < 2; j++) {
        if (a[i].equals(restrictedAreas[j])) {
          restricted = true;
          System.out.println(getName() + " cannot enter " + a[i] + " area");
        }
      }
      if (!restricted)
        System.out.println(getName() + " can enter " + a[i] + " area");
    }
  }
}
