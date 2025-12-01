package SV2.src.q8;

import java.util.*;

public class CollectionArrayList<E> extends AbstractList<E> {
  // This was the main difficulty I encountered, as Java does not allow the creation of an array of generic types, so I had to use this workaround

    // [James] Yes. In this case I would recommend having array as Objectp[, doing all internal processing as Object, and then just casting to E
    // in get(), remove() methods
  private E[] array = (E[]) new Object[16];
  private int currentMaxLength = 16;
  private int length = 0;

  private void checkIdxInBounds(int idx) {if (idx >= length || idx < 0) {throw new IndexOutOfBoundsException(String.format("index %d out of range for list of length %d", idx, length));}}
  private void checkIdxInBoundsInclusive(int idx) {if (idx > length || idx < 0) {throw new IndexOutOfBoundsException(String.format("index %d out of range for list of length %d", idx, length));}}

  @Override
  public E get(int idx) {
    this.checkIdxInBounds(idx);
    return array[idx];
  }

  @Override
  public int size() {return length;}

  @Override
  public void add(int idx, E data) {
    this.checkIdxInBoundsInclusive(idx);
    length++;
    
    if (length >= currentMaxLength) {
      E[] temp = (E[]) new Object[currentMaxLength * 2];
      for (int i = 0; i < length - 1; i++) {
        temp[i] = array[i];
      }
      currentMaxLength *= 2;
      array = temp;
    }

    for (int i = length; i > idx; i--) {
      array[i] = array[i - 1];
    }
    
    array[idx] = data;
  }
  
  @Override
  public E set(int idx, E data) {
    this.checkIdxInBounds(idx);
    E ret = array[idx];
    array[idx] = data;
    return ret;
  }
  
  @Override
  public E remove(int idx) {
    this.checkIdxInBounds(idx);
    length--;
    E ret = array[idx];

    for (int i = idx; i < length - 1; i++) {
      array[i] = array[i + 1];
    }

    return ret;
  }

  public void print() {
    for (int i = 0; i < length; i++) {
      System.out.print(this.get(i));
      System.out.print(",");
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    CollectionArrayList<Integer> l = new CollectionArrayList<>();
    for (int i = 0; i < 20; i++) {
      l.add(i, i);
    }
    l.print();
    l.remove(16);
    l.print();
  }
}

