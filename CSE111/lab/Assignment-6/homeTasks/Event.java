// Task 5

public class Event {
  private static int eCount;
  private static Event[] events = new Event[5];

  private String name;
  public String date;

  public String getName() { return name; }

  Event(String n, String d) {
    name = n;
    date = d;
    events[eCount++] = this;
  }

  public String details() { return ("Name: " + name + "\nDate: " + date); }

  public static void allEventInfo() {
    System.out.println("Total Events: " + eCount);
    System.out.println("Event Details:");
    for (int i = 0; i < eCount; i++) {
      Event e = events[i];
      System.out.println("Event " + (i + 1) + ":");
      System.out.println(e.details());
    }
  }
}

class Organizer {
  private String name;
  private int eCount;
  private Event[] ev = new Event[4];

  Organizer(String n) { name = n; }
  Organizer() { System.out.println("Please provide the organizer's name"); }

  public void organizeEvent(Event e) {
    ev[eCount++] = e;
    System.out.println(name + " successfully organized " + e.getName());
  }

  public void searchEventByDate(String d) {
    for (int i = 0; i < eCount; i++) {
      if (ev[i].date.equals(d)) {
        System.out.println(ev[i].getName());
        return;
      }
    }
    System.out.println("No event is scheduled for " + d);
  }
}
