package SV3.src.q10.Shape;

import java.util.*;

public class GroupOfShapes {
  private List<Shape> shapeList = new ArrayList<>();
  
  public void addShape(Shape s) {
    shapeList.add(s);
  }

  public void draw() {
    for (Shape s : shapeList) {s.draw();}
  }
}
