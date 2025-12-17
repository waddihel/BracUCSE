public class EventTester {
  public static void main(String args[]) {
    Event.allEventInfo();
    System.out.println("1--------------");
    Event ev1 = new Event("HP Day", "7/12/24");
    Event ev2 = new Event("TechConnect", "10/12/24");
    System.out.println(ev1.details());
    System.out.println("2--------------");
    Organizer uni = new Organizer();
    Organizer bracu = new Organizer("BRACU");
    Organizer buet = new Organizer("BUET");
    System.out.println("3--------------");
    Event.allEventInfo();
    System.out.println("4--------------");
    bracu.organizeEvent(ev1);
    bracu.organizeEvent(ev2);
    System.out.println("5--------------");
    Event ev3 = new Event("From Earth to Orbit", "15/12/24");
    Event ev4 = new Event("NSysS 2024", "21/12/24");
    System.out.println("6--------------");
    buet.organizeEvent(ev4);
    bracu.organizeEvent(ev3);
    System.out.println("7--------------");
    bracu.searchEventByDate("21/12/24");
    System.out.println("8--------------");
    bracu.searchEventByDate("15/12/24");
    System.out.println("9--------------");
    Event.allEventInfo();
  }
}
