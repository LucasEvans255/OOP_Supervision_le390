package q4;

public class OOPLazySortedLinkedList extends OOPSortedLinkedList {
  private boolean newInsert = false;
  @Override
  public void insert(int n) {
    newInsert = true;
    OOPLinkedListElement current = head;
    if (head == null) {
      head = new OOPLinkedListElement(n, null);
      return;
    }

    while (current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(new OOPLinkedListElement(n, null));
  }

  @Override
  public OOPLinkedListElement getNth(int n) {
    OOPSortedLinkedList temp;
    if (newInsert) {
      temp = new OOPSortedLinkedList();
      int length = 0;
      OOPLinkedListElement current = head;
      while (current != null) {
        temp.insert(current.getVal());
        current = current.getNext();
      }
    } else {temp = (OOPSortedLinkedList)this;}
    return temp.getNth(n);
  }

  public static void main(String[] args) {
    OOPLazySortedLinkedList l = new OOPLazySortedLinkedList();
    l.insert(1);
    l.insert(2);
    l.insert(3);
    System.out.println(l.getNth(0).getVal());
    System.out.println(l.getNth(1).getVal());
    System.out.println(l.getNth(2).getVal());
  }
}
