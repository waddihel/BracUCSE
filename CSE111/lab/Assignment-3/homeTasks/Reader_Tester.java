public class Reader_tester {
  public static void main(String[] args) {

    System.out.println("1 ==========");
    Reader r1 = new Reader("Messi");
    Reader r2 = new Reader("Ronaldo", 3);
    System.out.println("2 ==========");
    r1.readerInfo();
    System.out.println("3 ==========");
    r2.addBook("Java");
    r2.addBook("Python");
    r2.addBook("C++");
    r2.readerInfo();
    System.out.println("4 ==========");
    r1.addBook("C#");
    r1.addBook("Rust");
    r1.addBook("GoLang");
    System.out.println("5 ==========");
    r2.addBook("Python");
    System.out.println("6 ==========");
    r1.readerInfo();
    System.out.println("7 ==========");
    r1.updateCapacity(3);
    System.out.println("8 ==========");
    r1.addBook("GoLang");
    System.out.println("9 ==========");
    r1.readerInfo();
  }
}
