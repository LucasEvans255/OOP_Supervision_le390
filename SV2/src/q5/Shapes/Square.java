package SV2.src.q5.Shapes;

public class Square extends Shape {
  public Square() {
    type = ShapeType.SQUARE;
  }

  @Override
  public void draw() {
    System.out.println("Drawing square");
  }
}
