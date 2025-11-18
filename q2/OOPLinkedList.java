package q2;
import q2.OOPLinkedListElement;

class OOPLinkedList {
  private OOPLinkedListElement head = null;

  public OOPLinkedList(OOPLinkedListElement head_in) {
    head = head_in;
  }

  public OOPLinkedListElement getHead() {
    return head;
  }

  public int length() {
    OOPLinkedListElement current = head;
    int i = 0;
    
    while (current != null) {
      i++;
      current = current.getNext();
    }

    return i;
  }

  public OOPLinkedListElement getNth(int n) {
    OOPLinkedListElement current = head;
    while (n > 0 && current != null) {
      n--;
      current = current.getNext();
    }

    return current;
  }
}
