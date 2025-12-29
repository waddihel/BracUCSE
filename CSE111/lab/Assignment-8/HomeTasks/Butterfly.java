// Task 1

public class Butterfly extends Caterpillar {

  Butterfly(String f, int a) { super(f, a); }

  public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
  }

  public void transform() {
    System.out.println("Caterpillar transforms into Butterfly");
  }

  public void eat(int f) {
    System.out.println(
        "Butterfly lost energy while flying and absorbed nectar");
    energy -= 5;
    energy += f * 5;
  }
}
class Moth extends Caterpillar {

  Moth(String f, int a) { super(f, a); }

  public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
  }

  public void transform() {
    System.out.println("Caterpillar transforms into Moth");
  }

  public void eat(int f) {
    System.out.println("Moth lost energy due to nocturnal activity");
    energy -= 2.5;
    energy += f * 2.5;
  }
}
