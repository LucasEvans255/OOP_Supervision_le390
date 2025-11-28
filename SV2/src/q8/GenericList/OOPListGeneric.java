package SV2.src.q8.GenericList;

interface OOPListGeneric<T> {
  public int length();
  public T getNth(int n);
  public void addToFront(T k);
  public T deleteFront();
  public void addToEnd(T k);
  public T deleteEnd();
}
