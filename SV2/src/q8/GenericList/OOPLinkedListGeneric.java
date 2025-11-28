package SV2.src.q8.GenericList;

public class OOPLinkedListGeneric<T> implements OOPListGeneric<T> {
  protected OOPLinkedListGenericElement<T> head = null;

  public OOPLinkedListGeneric() {}

  public int length() {
    OOPLinkedListGenericElement<T> current = head;
    int i = 0;
    
    while (current != null) {
      i++;
      current = current.getNext();
    }

    return i;
  }

  public T getNth(int n) {
    if (n > this.length()) {throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds for list of length %d", n, this.length()));}
    OOPLinkedListGenericElement<T> current = head;
    while (n > 0 && current != null) {
      n--;
      current = current.getNext();
    }

    return current.getVal();
  }

  public void addToEnd(T k) {
    OOPLinkedListGenericElement<T> current = head;
    if (head == null) {
      head = new OOPLinkedListGenericElement(k, null);
      return;
    }

    while (current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(new OOPLinkedListGenericElement(k, null));
  }

  public void addToFront(T k) {
    head = new OOPLinkedListGenericElement<T>(k, head);
  }

  public T deleteFront() throws ArrayIndexOutOfBoundsException {
    if (head == null) {throw new ArrayIndexOutOfBoundsException("Cannot delete head from an empty List");}
    T ret = head.getVal();
    head = head.getNext();
    return ret;
  }

  public T deleteEnd() throws ArrayIndexOutOfBoundsException {
    if (head == null) {throw new ArrayIndexOutOfBoundsException("Cannot delete head from an empty List");}
    
    OOPLinkedListGenericElement<T> current = head;
    OOPLinkedListGenericElement<T> prev = null;

    while (current.getNext() != null) {
      prev = current;
      current = current.getNext();
    }
    
    T ret = current.getVal();
    prev.setNext(null);
    return ret;
  }

  public void reverse() {
    if (head == null) {return;}
    OOPLinkedListGenericElement<T> current = head;
    OOPLinkedListGenericElement<T> next = current.getNext();
    head.setNext(null);

    while (next != null) {
      OOPLinkedListGenericElement<T> temp = next.getNext();
      next.setNext(current);
      current = next;
      next = temp;
    }

    head = current;
  }
}
