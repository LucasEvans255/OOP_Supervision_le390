package q2;

public class FunctionalArray {
  private BinaryTreeNode head = null;
  private int length;

  public FunctionalArray(int n) {
    length = n;
    head = new BinaryTreeNode(0);
    for (int i = 1; i < n; i++) {
      set(i, i);
    }
  }

  public void set(int index, int value) throws ArrayIndexOutOfBoundsException {
    BinaryTreeNode current = head;
    int tracker = index;

    if (index >= length) {throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds of length %d", index, length));}

    while (true) {
      if (tracker == 1) {
        current.setValue(value);
        return;}
      else if (tracker % 2 == 0) {current = current.getLeft();} 
      else {current = current.getRight();}
      tracker = tracker / 2;
    }
  }

  public int get(int index) throws ArrayIndexOutOfBoundsException {
    BinaryTreeNode current = head;
    int tracker = index;
    int ret = -1;

    if (index >= length) {throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds of length %d", index, length));}

    while (true) {
      if (tracker == 1) {ret = current.getValue(); break;}
      else if (tracker % 2 == 0) {current = current.getLeft();}
      else {current = current.getRight();}
      tracker = tracker / 2;
    }

    return ret;
  }

  public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
    FunctionalArray arr = new FunctionalArray(3);
    arr.set(0, 5);
    arr.set(1, 6);
    arr.set(2, 7);
    System.out.println(arr.get(2));
    arr.set(50, 1);
  }
}
