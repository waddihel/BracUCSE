// Task 4

public class ComplexNumber extends RealNumber {
  public double complexValue;

  ComplexNumber(double r, double i) {
    super(r);
    complexValue = i;
  }

  ComplexNumber() {
    this(1.0, 1.0);
  }

  public String details() {
    return getReal() + "\nImaginaryPart: " + complexValue;
  }
}
