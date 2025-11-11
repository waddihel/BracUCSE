// Task 4

public class MobilePhone {
  public int contactCapacity;
  public int contactCount = 0;
  public String[] contactNames;
  public int[] contactNums;

  public void setContactCapacity(int x) {
    contactCapacity = x;
    contactNames = new String[x];
    contactNums = new int[x];
  }

  public void details() {
    System.out.println("Total Contacts: " + contactCount);
    System.out.println("Contact List:");

    for (int i = 0; i < contactCount; i++) {
      System.out.println(contactNames[i] + ":" + contactNums[i]);
    }
  }

  public void addContact(String name, int num) {
    if (contactCount < contactCapacity) {
      contactNames[contactCount] = name;
      contactNums[contactCount] = num;
      System.out.println("The contact of " + name + " is added.");
      contactCount++;
    } else
      System.out.println("Storage Full!!");
  }

  public void makeCall(int num) {
    for (int i = 0; i < contactCount; i++) {
      if (num == contactNums[i]) {
        System.out.println("Calling " + contactNames[i] + " . . .");
        return;
      }
    }
    System.out.println("Calling " + num + " . . .");
  }
}
