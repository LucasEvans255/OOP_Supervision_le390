package SV3.src.q10.Shape;

import java.util.*;

public class DrawingProgram {
  private List<Shape> shapeList = new ArrayList<>();

  public void drawShapes() {
    for (Shape s : shapeList) {
      s.draw();
    }
  }

  public void addShape(Shape s) {
    shapeList.add(s);
  }

  public static void main(String[] args) throws InterruptedException {
    DrawingProgram drawer = new DrawingProgram();
    drawer.addShape(new Rectangle());
    drawer.addShape(new Rectangle());
    drawer.addShape(new Circle());

    while (true) {
      drawer.drawShapes();
      Thread.sleep(1000L / 30L);
    }
  }
}
