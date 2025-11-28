package SV2.src.q5.List;

public class OOPLinkedList implements OOPList {
  protected OOPLinkedListElement head = null;

  public OOPLinkedList() {}

  public int length() {
    OOPLinkedListElement current = head;
    int i = 0;
    
    while (current != null) {
      i++;
      current = current.getNext();
    }

    return i;
  }

  public int getNth(int n) {
    if (n > this.length()) {throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds for list of length %d", n, this.length()));}
    OOPLinkedListElement current = head;
    while (n > 0 && current != null) {
      n--;
      current = current.getNext();
    }

    return current.getVal();
  }

  public void addToEnd(int k) {
    OOPLinkedListElement current = head;
    if (head == null) {
      head = new OOPLinkedListElement(k, null);
      return;
    }

    while (current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(new OOPLinkedListElement(k, null));
  }

  public void addToFront(int k) {
    head = new OOPLinkedListElement(k, head);
  }

  public int deleteFront() throws ArrayIndexOutOfBoundsException {
    if (head == null) {throw new ArrayIndexOutOfBoundsException("Cannot delete head from an empty List");}
    int ret = head.getVal();
    head = head.getNext();
    return ret;
  }

  public int deleteEnd() throws ArrayIndexOutOfBoundsException {
    if (head == null) {throw new ArrayIndexOutOfBoundsException("Cannot delete head from an empty List");}
    
    OOPLinkedListElement current = head;
    OOPLinkedListElement prev = null;

    while (current.getNext() != null) {
      prev = current;
      current = current.getNext();
    }
    
    int ret = current.getVal();
    prev.setNext(null);
    return ret;
  }

  public void reverse() {
    if (head == null) {return;}
    OOPLinkedListElement current = head;
    OOPLinkedListElement next = current.getNext();
    head.setNext(null);

    while (next != null) {
      OOPLinkedListElement temp = next.getNext();
      next.setNext(current);
      current = next;
      next = temp;
    }

    head = current;
  }
}
