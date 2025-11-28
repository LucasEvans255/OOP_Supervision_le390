package SV2.src.q5.Queue;

public class ArrayQueueTest {
  public static void main(String[] args) {
    OOPArrayQueue q = new OOPArrayQueue();
    q.enqueue(1);
    q.enqueue(2);
    System.out.println(q.dequeue());
    q.enqueue(3);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
  }
}
