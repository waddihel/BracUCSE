// Task 3

public class Artifact {
  private static Artifact[] vault = new Artifact[4];
  private static int aCount;
  private static Artifact strongest;
  private String name;
  private String holder;

  Artifact(String n, String h) {
    name = n;
    holder = h;
    if (strongest == null)
      strongest = this;
    else if (strongest.CalcPower() < this.CalcPower()) {
      strongest = this;
    }
  }
  Artifact(String n) { this(n, "Okabe"); }

  public int CalcPower() {
    if (name.length() % 2 == 0) {
      int power = 0;
      for (int i = 0; i < name.length(); i += 2) {
        power += name.charAt(i);
      }
      return power;
    } else {
      int power = 0;
      for (int i = 1; i < name.length(); i += 2) {
        power += name.charAt(i);
      }
      return power;
    }
  }

  public static void AddtoVault(Artifact a) {
    if (aCount == 4)
      System.out.printf("!!%s unsuccessful in adding artifact to the vault!!\n",
                        a.holder);
    else {
      System.out.printf("%s added %s successfully to the vault.\n", a.holder,
                        a.name);
      vault[aCount++] = a;
    }
  }

  public void revealArtifact() {
    System.out.printf("%s added by %s has power of %d.\n", name, holder,
                      CalcPower());
  }

  public static void labReport() {
    System.out.println("=== Future Gadget Lab ===");
    for (int i = 0; i < aCount; i++) {
      vault[i].revealArtifact();
    }
  }

  public static String strongest() { return strongest.name; }

  public String GetName() { return name; }

  public void changeName(String n) {
    name = n;
    System.out.println("Name changed and power recalculated.");
    if (strongest.CalcPower() < this.CalcPower()) {
      strongest = this;
    }
  }
}
