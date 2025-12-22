// Task 1

public class Cow extends Animal {
  public String name;

  Cow() {
    System.out.println("The cow says hello!");
  }

  public String getName() {
    return name;
  }

  public void updateSound(String s) {
    super.sound = s;
  }
}
