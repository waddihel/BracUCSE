public class ProductTester {
  public static void main(String[] args) {
    Product p1 = new Product("Table", 10);
    Product p2 = new Product("Chair", 15);
    Product p3 = new Product("Sofa", 20);
    Product p4 = new Product("Divan", 8);
    System.out.println("------------1------------");
    Product.displayProducts();
    System.out.println("------------2------------");
    Product.buy("Chair", 5);
    System.out.println("------------3------------");
    Product.displayProducts();
    System.out.println("------------4------------");
    Product.buy("Sofa", 25);
    System.out.println("------------5------------");
    Product.displayProducts();
    System.out.println("------------6------------");
    Product.buy("Bed", 10);
  }
}
