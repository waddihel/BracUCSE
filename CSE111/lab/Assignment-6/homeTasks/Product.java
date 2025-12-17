// Task 1

public class Product {
  public static Product[] products = new Product[3];
  public static int count;

  public String name;
  public int qty;

  Product(String n, int q) {
    if (count != 3) {
      name = n;
      qty = q;
      products[count++] = this;
      System.out.println("Stored: " + n);
    } else {
      System.out.println("Storage is full! Cannot add " + n);
    }
  }

  public static void displayProducts() {
    System.out.println("=== Stored Products ===");
    for (int i = 0; i < 3; i++) {
      System.out.println(products[i].name + " - QTY: " + products[i].qty);
    }
  }

  public static void buy(String n, int q) {
    for (int i = 0; i < 3; i++) {
      if (products[i].name.equals(n)) {
        if (products[i].qty >= q) {
          products[i].qty -= q;
          System.out.println("Product sold");
        } else
          System.out.println("Quantity low");
        return;
      }
    }
    System.out.println("Product not found");
  }
}
