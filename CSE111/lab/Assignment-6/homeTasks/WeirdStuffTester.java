public class WeirderStuffTester {
  public static void main(String[] args) {
    Character.printStats();
    System.out.println("---------1-----------");
    Character twelve = new Character("Twelve", "Kid", 100);
    twelve.printDetails();
    System.out.println("---------2-----------");
    Character spike = new Character("Spike", "Kid", 50);
    spike.printDetails();
    System.out.println("---------3-----------");
    Character.printStats();
    System.out.println("---------4-----------");
    Character reeve = new Character("Reeve", 70);
    reeve.printDetails();
    System.out.println("---------5-----------");
    Character chopper = new Character("Chopper", "Adult", 120);
    chopper.printDetails();
    System.out.println("---------6-----------");
    Character.printStats();
  }
}
