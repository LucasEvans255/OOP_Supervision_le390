package q2;

public class OOPLinkedListElement {
  private int val;
  private OOPLinkedListElement next = null;

  public OOPLinkedListElement(int val_input, OOPLinkedListElement next_input) {
    val = val_input;
    OOPLinkedListElement next = next_input;
  }

  public OOPLinkedListElement() {}

  public int getVal() {
    return val;
  }

  public OOPLinkedListElement getNext() {
    return next;
  }
}
