package SV2.src.q8.GenericList;

public class OOPLinkedListGenericElement<T> {
  private T val;
  private OOPLinkedListGenericElement next = null;

  public OOPLinkedListGenericElement(T val_input, OOPLinkedListGenericElement next_input) {
    val = val_input;
    next = next_input;
  }

  public OOPLinkedListGenericElement() {}

  public T getVal() {
    return val;
  }

  public OOPLinkedListGenericElement getNext() {
    return next;
  }

  public void setNext(OOPLinkedListGenericElement newElement) {
    next = newElement;
  }
}
