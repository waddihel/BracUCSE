public class TesterArtifact {
  public static void main(String[] args) {
    Artifact a = new Artifact("Phone Microwave", "Kurisu");
    System.out.println("--------1-------");
    Artifact.AddtoVault(a);
    Artifact.AddtoVault(new Artifact("D-Mail Capsule", "Mayuri"));
    System.out.println("--------2-------");
    Artifact c = new Artifact("C204 Chip");
    Artifact d = new Artifact("Divergence Meter");
    Artifact e = new Artifact("M4A2 Robot", "Okabe");
    Artifact.AddtoVault(c);
    Artifact.AddtoVault(d);
    Artifact.AddtoVault(e);
    System.out.println("--------3-------");
    Artifact.labReport();
    System.out.println("--------4-------");
    System.out.println("Power of " + c.GetName() + " is " + c.CalcPower());
    System.out.println("--------5-------");
    System.out.println("Strongest Artifact: " + Artifact.strongest());
    System.out.println("--------6-------");
    a.revealArtifact();
    System.out.println("--------7-------");
    a.changeName("Banana Microwave");
    System.out.println("--------8-------");
    Artifact.labReport();
    System.out.println("--------9-------");
    System.out.println("Strongest Artifact: " + Artifact.strongest());
  }
}
