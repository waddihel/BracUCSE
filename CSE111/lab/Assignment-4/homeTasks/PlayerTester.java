public class PlayerTester {
  public static void main(String[] args) {
    Player ben = new Player("Ben", 10);
    System.out.println("======1======");
    ben.viewInfo();
    System.out.println("======2======");
    ben.defeatVillain("Vilgax", 100);
    System.out.println("======3======");
    ben.defeatVillain("Yamcha", 10);
    System.out.println("======4======");
    ben.viewInfo();
    System.out.println("======5======");
    ben.defeatVillain('8', "Vilgax", 100);
    System.out.println("======6======");
    ben.viewInfo();
    System.out.println("======7======");
    Player kevin = new Player("Kevin");
    System.out.println("======8======");
    kevin.viewInfo();
    System.out.println("======9======");
    ben.defeatVillain(kevin);
    System.out.println("======10======");
    ben.viewInfo();
    System.out.println("======11======");
    Player goku = new Player("Goku", 9000);
    System.out.println("======12======");
    ben.defeatVillain(goku);
  }
}
