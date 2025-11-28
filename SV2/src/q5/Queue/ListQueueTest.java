package SV2.src.q5.Queue;

public class ListQueueTest {
  public static void main(String[] args) {
    OOPListQueue q = new OOPListQueue();
    q.enqueue(1);
    q.enqueue(2);
    System.out.println(q.dequeue());
    q.enqueue(3);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
  }
}

