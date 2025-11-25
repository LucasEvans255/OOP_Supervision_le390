package q2;

class OOPLinkedList {
  private OOPLinkedListElement head = null;

  // [James] This constructor makes OOPLinkedListElement visible to the outside world
    // Worse, it *requires* the outside world to use it to create a list
  /* Consider instead:
  public OOPLinkedList() {
     this(new OOPLinkedListElement());
  }
  private OOPLinkedList(OOPLinkedListElement head_in) {
    head = head_in;
  }

  Also - this means we have no way to have an empty list, which we do need to support.
   */


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
