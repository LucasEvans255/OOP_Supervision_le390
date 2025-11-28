package SV2.src.q5.Shapes;

enum ShapeType {
  NONE,
  CIRCLE,
  SQUARE
}

abstract class Shape {
  protected ShapeType type = ShapeType.NONE;
  abstract void draw();
  

  public ShapeType getShapeType() {return type;}
}
