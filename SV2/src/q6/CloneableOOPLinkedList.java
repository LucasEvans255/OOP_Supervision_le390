package SV2.src.q6;

import SV2.src.q5.List.OOPLinkedList;

public class CloneableOOPLinkedList extends OOPLinkedList implements Cloneable {
  @Override
  public Object clone() {

      // [James] This works...but I think the question really wanted you to use super.clone(), and then use OOPLinkedListElement.clone() to ensure it was a deep copy
    OOPLinkedList newList = new CloneableOOPLinkedList(); 
    
    for (int i = 0; i < this.length(); i++) {
      newList.addToFront(this.getNth(i));
    }

    return newList;
  }
}
