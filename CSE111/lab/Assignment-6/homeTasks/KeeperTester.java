import java.util.Arrays;
public class KeeperTester {
  public static void main(String[] args) {
    Animalkeepers.details();
    System.out.println("---------1----------");
    System.out.println(Arrays.toString(Animalkeepers.Animals));
    System.out.println("---------2----------");
    Animalkeepers leo = new Animalkeepers("Leo");
    Animalkeepers theo = new Animalkeepers("Theo");
    Animalkeepers mochi = new Animalkeepers("Mochi");
    System.out.println("---------3----------");
    Animalkeepers.printTasks();
    System.out.println("---------4----------");
    leo.doTask("Lion", "Feed");
    System.out.println("---------5----------");
    leo.doTask("Monkey", "Feed");
    System.out.println("---------6----------");
    Animalkeepers.details();
    System.out.println("---------7----------");
    theo.doTask("Tiger", "Bathe");
    mochi.doTask("Seal", "Clean Pen");
    mochi.doTask("Deer", "Add Food");
    System.out.println("---------8----------");
    Animalkeepers.printTasks();
    System.out.println("---------9----------");
    leo.doTask("Deer", "Play");
    System.out.println("---------10----------");
    Animalkeepers.details();
  }
}
