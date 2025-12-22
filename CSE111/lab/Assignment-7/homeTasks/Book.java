// Task 3

public class Book extends Product {
  private String isbn;
  private String publisher;

  Book(int i, String n, int p, String ib, String pub) {
    super(i, n, p);
    isbn = ib;
    publisher = pub;
  }

  public String printDetail() {
    return getIdTitlePrice() + (" ISBN: " + isbn + " Publisher: " + publisher);
  }
}

class CD extends Product {
  private String band;
  private int duration;
  private String genre;

  CD(int i, String n, int p, String b, int d, String g) {
    super(i, n, p);
    band = b;
    duration = d;
    genre = g;
  }

  public String printDetail() {
    return getIdTitlePrice() + (" Band: " + band + " Duration: " + duration +
                                " minutes Genre: " + genre);
  }
}
