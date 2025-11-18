package q2;

public class BinaryTreeNode {
  private int value;
  private BinaryTreeNode right;
  private BinaryTreeNode left;

  public BinaryTreeNode(int n) {
    value = n;
    right = null;
    left = null;
  }

  public int getValue() {return value;}

  public void setValue(int n) {value = n;}

  public BinaryTreeNode getLeft() {return left;}

  public BinaryTreeNode getRight() {return right;}

  public void setLeft(BinaryTreeNode l) {left = l;}

  public void setRight(BinaryTreeNode r) {right = r;}
}
