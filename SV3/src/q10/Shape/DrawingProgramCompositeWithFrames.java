package SV3.src.q10.Shape;

public class DrawingProgramCompositeWithFrames {
  private GroupOfShapes shapes = new GroupOfShapes();

  public void addShape(Shape s) {
    shapes.addShape(s);
  }

  public void draw() {
    shapes.draw();
  }

  public static void main(String[] args) throws InterruptedException {
    DrawingProgramComposite drawer = new DrawingProgramComposite();
    drawer.addShape(new Rectangle());
    drawer.addShape(new Rectangle());
    drawer.addShape(new FrameAroundShape(new Rectangle()));
    drawer.addShape(new FrameAroundShape(new Circle()));
    drawer.addShape(new Circle());

    while (true) {
      drawer.draw();
      Thread.sleep(1000L / 30L);
    }
  }
}
