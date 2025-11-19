package q3;

class AccessField {
  public void access(NoAccessModifier obj) {
    int y = obj.x;
  }
}

public class NoAccessModifier {
  int x = 5;

  public static void main(String[] args) {
    NoAccessModifier nam = new NoAccessModifier();
    AccessField af = new AccessField();
    af.access(nam);
    NoAccessModifierI nami = new NoAccessModifierI();
  }
}

class NoAccessModifierI extends NoAccessModifier {
  public NoAccessModifierI() {
    super();
    this.x = 5;
  }
}
