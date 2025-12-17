public class tester11 {
  public static void main(String[] args) {
    TestX tx = new TestX();
    int[] data = {4, 6, 2, 3, 5};
    tx.compute(data);
    tx.modify(tx);
  }
}
