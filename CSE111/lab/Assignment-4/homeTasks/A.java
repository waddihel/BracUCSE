public class A {
  public int x, y = 2, sum = 5;
  public A() {
    x = sum - y;
    this.methodB(1);
  }
  public A(int x) { this.x = x; }
  public void methodB(int y) {
    int temp = (y++) + (++this.y);
    sum = y + temp - ++this.x;
    System.out.println(y + " " + temp + " " + (sum++));
    this.y = (++temp) + methodC(temp, y) + x;
  }
  public void methodA(int temp, int x) {
    A a2 = new A(6);
    a2.sum = this.methodC(a2);
    System.out.println(this.x + " " + a2.sum + " " + y);
    this.sum = a2.methodC(this);
    System.out.println(a2.x + " " + this.sum + " " + a2.y);
  }
  public int methodC(A a) { return this.x + a.y + a.sum; }
  public int methodC(int sum, int y) {
    y = (this.x++) + sum + 3;
    return y;
  }
}
