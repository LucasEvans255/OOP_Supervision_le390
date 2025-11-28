package SV2.src.q5.List;

public class OOPArrayList implements OOPList {
  private int length = 0;
  private int currentMaxLength = 64;
  private int[] array = new int[64];

  private void checkDoubleLength() {
    if (length >= currentMaxLength) {
      int[] temp_array = new int[currentMaxLength * 2];
      for (int i = 0; i < currentMaxLength; i++) {
        temp_array[i] = array[i];
      }
      array = temp_array;
    }
  }

  public int length () {
    return length;
  }

  public int getNth(int n) throws ArrayIndexOutOfBoundsException {
    if (n >= length) {
      throw new ArrayIndexOutOfBoundsException(String.format("Index %d out of bounds of length %d", n, length));
    }
    return array[n];
  }

  public void addToEnd(int k) {
    length++;
    checkDoubleLength();
    array[length - 1] = k;
  }

  public void addToFront(int k) {
    length++;
    checkDoubleLength();
    for (int i = 1; i < length; i++) {
      array[i] = array[i - 1];
    }
    array[0] = k;
  }

  public int deleteFront() {
    int ret = array[0];
    for (int i = 1; i < length; i++) {
      array[i - 1] = array[i];
    }
    length--;
    return ret;
  }

  public int deleteEnd() {
    int ret = array[length - 1];
    length--;
    return ret;
  }

  public void reverse() {
    int[] temp = new int[currentMaxLength];

    for (int i = 0; i < length; i++) {
      temp[i] = array[length - i - 1];
    }
  }
}
