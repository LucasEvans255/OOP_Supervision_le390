package q1;

class Recursion {
  public float pow(float a, int n) {
    if (n == 0) {return a;}
    return a * pow(a, (n - 1));
  }

  public float tailPow(float a, int n) {
    if (n == 0) {return a;}
    return pow(a * a, (n - 1));
  }

  // [James] and then code to actually test this?
}
