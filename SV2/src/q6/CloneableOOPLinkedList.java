package SV2.src.q6;

import SV2.src.q5.List.OOPLinkedList;

public class CloneableOOPLinkedList extends OOPLinkedList implements Cloneable {
  @Override
  public Object clone() {
    OOPLinkedList newList = new CloneableOOPLinkedList(); 
    
    for (int i = 0; i < this.length(); i++) {
      newList.addToFront(this.getNth(i));
    }

    return newList;
  }
}
