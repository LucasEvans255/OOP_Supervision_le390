package SV2.src.q5.Queue;

public class OOPArrayQueue implements Queue {
  private int currentMaxLength = 64;
  private int[] array = new int[currentMaxLength];
  private int head = 0;
  private int tail = 0;

  public boolean empty() {return (head - tail) == 0;}

  public void enqueue(int k) {
    if ((head - 1) % currentMaxLength == tail) {
      currentMaxLength *= 2;
      int[] temp = new int[currentMaxLength];

      for (int i = head; i < head + (currentMaxLength / 2); i++) {
        temp[i] = array[i % (currentMaxLength / 2)];
      }

      array = temp;
      head = 0;
      tail = (currentMaxLength / 2) - 1;
    }
    head = (currentMaxLength + head - 1) % currentMaxLength;
    array[head] = k;
  }

  public int dequeue() throws ArrayIndexOutOfBoundsException {
    if (this.empty()) {throw new ArrayIndexOutOfBoundsException("Cannot dequeue from an empty queue");}
    int ret = array[tail];
    tail = (currentMaxLength + tail - 1) % currentMaxLength;
    return ret;
  }
}

