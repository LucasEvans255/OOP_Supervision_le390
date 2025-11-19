package q4;

public class OOPSortedLinkedList extends OOPLinkedList {
  @Override
  public void insert(int n) {
    if (head == null || head.getVal() >= n) {
      head = new OOPLinkedListElement(n, head);
      return;
    }
    OOPLinkedListElement current = head;

    while (current.getNext() != null && current.getNext().getVal() < n) {
      current = current.getNext();
    }

    current.setNext(new OOPLinkedListElement(n, current.getNext()));
}

  public static void main(String[] args) {
    OOPSortedLinkedList l = new OOPSortedLinkedList();
    l.insert(1);
    l.insert(3);
    l.insert(2);
    System.out.println(l.getNth(0).getVal());
    System.out.println(l.getNth(1).getVal());
    System.out.println(l.getNth(2).getVal());
  }
}
