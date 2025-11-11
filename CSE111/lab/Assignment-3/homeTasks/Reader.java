public class Reader {
  public String name;
  public int capacity;
  public String[] books;
  public int count = 0;

  Reader(String n, int c) {
    name = n;
    capacity = c;
    books = new String[c];
    System.out.println("A new reader is created!");
  }
  Reader(String n) { this(n, 2); }

  public void addBook(String b) {
    if (count == capacity)
      System.out.println("No more capacity");
    else {
      books[count] = b;
      count++;
    }
  }

  public void readerInfo() {
    System.out.println("Name: " + name);
    System.out.println("Capacity: " + capacity);
    System.out.println("Books:");
    for (int i = 0; i < count; i++) {
      System.out.println("Book " + (i + 1) + ": " + books[i]);
    }
  }

  public void updateCapacity(int c) {
    String[] temp = new String[c];
    for (int i = 0; i < count; i++) {
      temp[i] = books[i];
    }
    capacity = c;
    books = temp;
    System.out.println("Capacity changed to " + capacity);
  }
}
