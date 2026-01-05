// Task 1

public class SmartSecurityCamera extends SmartDevice {
  public int storage;
  public int usedStorage;
  public String password = "ADMIN123";
  public boolean irActive;

  SmartSecurityCamera(String n, int b, int s) {
    super(n, b);
    storage = s;
  }

  public void record(boolean ir) {
    if (ir) {
      System.out.println("[IR SENSORS ACTIVE]");
      irActive = true;
    }
    usedStorage++;
    System.out.println("Recording standard footage.");
  }
  public void record() {
    record
    (false);
  }

  public void formatCard(String p) {
    System.out.println("REQUEST: Format SD Card initiated.");
    if (!isActive)
      System.out.println("ERROR: Device must be ON to format.");
    else if (p.equals(password)) {
      System.out.println(
          "Auth Success. Wiping data.\nSUCCESS: Storage restored to 64GB.");
      usedStorage = 0;
    } else {
      System.out.println("ACCESS DENIED: Incorrect PIN.");
    }
  }

  public void powerOn() {
    if (usedStorage >= storage)
      System.out.println("Error: Indoor-Cam storage full. Recording disabled.");
    else
      super.powerOn();
  }

  public void powerOff() {
    if (irActive) {
      irActive = false;
      System.out.println("Turning off Night Vision.");
    }
    super.powerOff();
  }
}
