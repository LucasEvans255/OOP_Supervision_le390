package SV2.src.q6;

class ParentClass implements Cloneable {
  private int parentData = 5;
  public void setParentData(int x) {
    parentData = x;
  }

  public int getParentData() {return parentData;}
  
  @Override
  public Object clone() {
    ParentClass newObj = new ParentClass();
    newObj.setParentData(parentData);
    return newObj;
  }
}

class ChildClass extends ParentClass implements Cloneable {
  private int childData = 4;
  public void setChildData(int x) {
    childData = x;
  }

  public int getChildData() {return childData;}

  @Override
  public Object clone() {
    ChildClass newObj = new ChildClass();
    newObj.setChildData(childData);
    return newObj;
  }
}

public class NoSuperClone {
  public static void main(String[] args) {
    ChildClass obj = new ChildClass();
    obj.setParentData(10);
    obj.setChildData(11);
    ChildClass newObj = (ChildClass)obj.clone();
    System.out.println(newObj.getParentData());
    System.out.println(newObj.getChildData());
  }
}
