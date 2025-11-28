package SV2.src.q5.Queue;

import SV2.src.q5.List.OOPLinkedList;

public class OOPListQueue implements Queue {
  private OOPLinkedList xlist;
  private OOPLinkedList ylist;
  public OOPListQueue() {
    xlist = new OOPLinkedList();
    ylist = new OOPLinkedList();
  }

  private void normalise() {
    if (xlist.length() == 0) {
      ylist.reverse();
      xlist = ylist;
      ylist = new OOPLinkedList();
    }
  }

  public boolean empty() {
    return (xlist.length() == 0) && (ylist.length() == 0);
  }

  public void enqueue(int k) {
    ylist.addToFront(k);
  }

  public int dequeue() throws ArrayIndexOutOfBoundsException {
    if (this.empty()) {throw new ArrayIndexOutOfBoundsException("Cannot dequeue from an empty queue");}
    this.normalise();
    int ret = xlist.deleteFront();
    return ret;
  }
}

