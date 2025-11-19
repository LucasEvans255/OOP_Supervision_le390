package q3;

class A {
  private int n;
  public A(int x) {
    n = x;
  }
}

class B extends A {
  public B(int x) {
    super(x);
  }
}

class C extends B {
  public C(int x) {
    super(x);
  }
}

public class ConstructorChaining {
  public static void main(String[] args) {
    C myObj = new C(5);
  }
}
