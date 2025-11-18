package q2;

public class SearchSet {
  private int numElements;
  private BinaryTreeNode head;

  public SearchSet() {
    numElements = 0;
    head = null;
  }

  public void insert(int n) {
    BinaryTreeNode current = head;

    if (current == null) {
      head = new BinaryTreeNode(n);
      numElements++;
      return;
    }

    while (current != null) {
      int val = current.getValue();
      if (val < n) {
        if (current.getLeft() == null) {
          current.setLeft(new BinaryTreeNode(n));
          numElements++;
          return;
        }
        current = current.getLeft();
      } else if (val > n) {
        if (current.getRight() == null) {
          current.setRight(new BinaryTreeNode(n));
          numElements++;
        }
        current = current.getRight();
      } else {
        return;
      }
    }
  }

  public int getNumElements() {return numElements;}

  public boolean contains(int n) {
    BinaryTreeNode current = head;

    while (current != null) {
      int val = current.getValue();
      if (val == n) {return true;} 
      else if (val < n) {current = current.getLeft();}
      else {current = current.getRight();}
    }

    return false;
  }

  public static void main(String[] args) {
    SearchSet s = new SearchSet();
    s.insert(1);
    s.insert(2);
    s.insert(3);
    System.out.println(s.contains(2));
    System.out.println(s.contains(4));
    System.out.println(s.getNumElements());
  }
}
