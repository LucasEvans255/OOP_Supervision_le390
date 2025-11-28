package SV2.src.q9;

public class NewtonRaphsonSquareRoot {
  private int iterations = 10;
  public double squareRoot(double x0) {
    if (x0 < 0) {throw new ArithmeticException("Attempting to calculate the square root of a negative number");}
    double xN = x0;
    for (int i = 0; i < iterations; i++) {
      assert xN != 0 : "Newton Raphson method produced xN = 0";
      assert xN > 0 : "Newton Raphson method produced a negative xN";
      xN = (0.5) * (xN + (x0 / xN));
    }
    return xN;
  }

  public static void main(String[] args) {
    NewtonRaphsonSquareRoot sq = new NewtonRaphsonSquareRoot();
    System.out.println(sq.squareRoot(2.0));
    System.out.println(sq.squareRoot(25.0));
  }
}
