// Task 2

public class Character {
  public static int cCount;
  public static int kids;
  public static int teens;
  public static int adults;
  public static int tH;
  public static double avgH;
  public static Character strongest;

  public String name;
  public int health;
  public String group;
  public int id;

  Character(String n, String g, int h) {
    name = n;
    group = g;
    health = h;
    tH += h;
    id = ++cCount;
    avgH = tH / cCount;
    if (strongest == null)
      strongest = this;
    else if (strongest.health < h)
      strongest = this;
    if (g.equals("Kid"))
      kids++;
    else if (g.equals("Teen"))
      teens++;
    else if (g.equals("Adult"))
      adults++;
  }
  Character(String n, int h) { this(n, "Teen", h); }

  public void printDetails() {
    System.out.println("ID: " + id + ", Name: " + name);
    System.out.println("Group: " + group);
    System.out.println("Health: " + health);
  }
  public static void printStats() {
    System.out.printf(
        "Total Characters: %d\nKids: %d\nTeens: %d\nAdults: %d\nAverage "
            + "Health: %.1f\nStrongest Character: ",
        cCount, kids, teens, adults, avgH);
    if (strongest == null)
      System.out.print("None\n");
    else
      System.out.println('\n' + strongest.name + " (Health " +
                         strongest.health + ")");
  }
}
