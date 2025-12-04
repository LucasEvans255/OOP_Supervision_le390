package SV3.src.q10.Shape;

public class FrameAroundShape extends Shape {
  private Shape s = null;

  // [James] this did not actually compile until I moved the ; ...
  FrameAroundShape(Shape s) {this.s = s;}

  public void draw() {
    s.draw();
  }
}
