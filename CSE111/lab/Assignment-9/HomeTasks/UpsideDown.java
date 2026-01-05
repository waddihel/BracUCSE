// Task 2

public class UpsideDown extends Hawkins {
  public static int totalBridges;
  public int bCount;
  public Hawkins bridge1;
  public Hawkins bridge2;

  UpsideDown(String n) { super(n); }

  public void connect(Hawkins p) {
    if (bCount == 2)
      System.out.println("No further bridges with " + name);
    else if (bridge1 == null) {
      totalBridges++;
      bCount++;
      bridge1 = p;
      p.status = true;
    } else {
      totalBridges++;
      bCount++;
      bridge2 = p;
      p.status = true;
    }
  }

  public void details() {
    System.out.println(name + " details:");
    if (bridge1 != null)
      System.out.println("Bridge 1: " + bridge1.name);
    if (bridge2 != null)
      System.out.println("Bridge 2: " + bridge2.name);
  }

  public void disconnect(int i) {
    if (i == 1) {
      bridge1.status = false;
      bridge1 = null;
      bCount--;
      totalBridges--;
    } else if (i == 2) {
      bridge2.status = false;
      bridge2 = null;
      bCount--;
      totalBridges--;
    } else
      System.out.println("Invalid bridge number!");
  }

  public void activate(Hawkins p) {
    System.out.println("Activating the door of " + p.name);
  }

  public Hawkins getBridge1() { return bridge1; }
  public Hawkins getBridge2() { return bridge2; }
}
