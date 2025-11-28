package SV2.src.q5.List;

public class ListTest {
  public static void main(String[] args) {
    OOPList l = new OOPArrayList();
    l.addToFront(0);
    l.addToEnd(1);
    l.addToEnd(2);
    System.out.println(String.format("[%d, %d, %d]", l.getNth(0), l.getNth(1), l.getNth(2)));
    System.out.println(l.length());
    l.deleteEnd();
    System.out.println(String.format("[%d, %d]", l.getNth(0), l.getNth(1)));
    System.out.println(l.length());
    l.getNth(2);
  }
}
