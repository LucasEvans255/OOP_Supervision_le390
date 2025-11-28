package SV2.src.q5.Shapes;

public class Circle extends Shape {
  public Circle() {
    type = ShapeType.CIRCLE;
  }

  @Override
  public void draw() {
    System.out.println("Drawing circle");
  }
}
