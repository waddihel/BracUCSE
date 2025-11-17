// Task 1

public class Player {
  public int hp;
  public String name;
  public String defeated = "";

  Player(String n, int h) {
    name = n;
    hp = h;
    System.out.println(n + " joined the game\n"
                       + "HP: " + h);
  }
  Player(String n) { this(n, 100); }

  public void viewInfo() {
    System.out.println("Player name: " + name + "\nCurrent HP: " + hp);
    if (defeated.length() > 0)
      System.out.println("Defeated:\n" + defeated);
  }

  public void defeatVillain(String n, int h) {
    if (h > hp) {
      System.out.println("failed to defeat " + n);
    } else {
      System.out.println("defeated " + n);
      hp += h;
      defeated += n + ", ";
    }
  }
  public void defeatVillain(char b, String n, int h) {
    hp *= (b - 48);
    System.out.println("HP with " + b + "x boost: " + hp);
    defeatVillain(n, h);
  }
  public void defeatVillain(Player p) { defeatVillain(p.name, p.hp); }
}
