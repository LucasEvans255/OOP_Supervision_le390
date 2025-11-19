package q4;

class OOPLinkedList {
  protected OOPLinkedListElement head = null;

  public OOPLinkedList(OOPLinkedListElement head_in) {
    head = head_in;
  }

  public OOPLinkedList() {}

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

  public void insert(int n) {
    OOPLinkedListElement current = head;
    if (head == null) {
      head = new OOPLinkedListElement(n, null);
    }

    while (current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(new OOPLinkedListElement(n, null));
  }
}
