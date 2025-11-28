package SV2.src.q5.Shapes;

public class ShapeChecker {
  public static void CheckTypeOfShape(Shape s) {
    switch(s.getShapeType()) {
      case CIRCLE:
        System.out.println("This is a circle");
        break;
      case SQUARE:
        System.out.println("This is a square");
        break;
    }
  }

  public static void main(String[] args) {
    Square s = new Square();
    Circle c = new Circle();
    CheckTypeOfShape(s);
    CheckTypeOfShape(c);
  }
}
