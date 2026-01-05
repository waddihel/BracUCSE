public class HawkinsLabTester {
  public static void main(String[] args) {
    Hawkins place1 = new Hawkins("Hawkins Lab");
    Hawkins place2 = new Hawkins("Palace Arcade");
    UpsideDown gate1 = new UpsideDown("The Nina Project");
    UpsideDown gate2 = new UpsideDown("Brimborn Steel Works");
    DarkDimension world = new DarkDimension("The Dark World");
    gate1.open();
    System.out.println("Total bridges: " + UpsideDown.totalBridges);
    System.out.println("======== [1] ========");
    gate1.connect(place1);
    gate1.connect(place2);
    Hawkins place3 = new Hawkins("Starcourt Mall");
    gate2.connect(place3);
    gate1.details();
    gate2.details();
    System.out.println("======== [2] ========");
    world.runExperiment(gate1);
    world.runExperiment(gate2);
    System.out.println("======== [3] ========");
    System.out.println("Total bridges: " + UpsideDown.totalBridges);
    System.out.println("======== [4] ========");
    Hawkins place4 = new Hawkins("Byers new house");
    gate1.connect(place4);
    gate1.disconnect(2);
    gate2.disconnect(3);
    System.out.println("======== [5] ========");
    gate1.details();
  }
}

// Grand Parent Class
class Hawkins {
  public String name;
  public boolean status = false;

  public Hawkins(String name) { this.name = name; }

  public boolean checkBridge(Hawkins h) {
    if (h.status == true) {
      System.out.println("Bridge present at " + h.name);
      return true;
    } else {
      System.out.println("No Bridge present at " + h.name);
      return false;
    }
  }

  public void open() {
    if (status == false) {
      status = true;
      System.out.println("Bridge from " + name + " is Open");
    }
  }
}

// Child Class
class DarkDimension extends UpsideDown {
  public DarkDimension(String name) { super(name); }

  public void runExperiment(UpsideDown portal) {
    if (!this.checkBridge(portal)) {
      System.out.println("Cannot run experiment.");
    } else {
      if (portal.getBridge1() != null) {
        portal.activate(portal.getBridge1());
        System.out.println("Experiment executed successfully!");
      } else if (portal.getBridge2() != null) {
        portal.activate(portal.getBridge2());
        System.out.println("Experiment executed successfully!");
      } else {
        System.out.println("No experiment found!");
      }
    }
  }
}
