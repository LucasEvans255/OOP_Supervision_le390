package q3;

public class PassByValueOrReferenceTest {
  public static void test(int[] arr) {
    System.out.println(arr);
  }

  public static void main(String[] args) {
    int[] test = {1, 2, 3};
    System.out.println(test);
    test(test);
  }

  /*
  [James]
  How would behaviour differ here between Passing by reference and passing a reference variable by value?

  Consider what would happen if we rewrote test:

  public static void test(int[] arr) {
    arr[0] = 64;
    arr = null;
  }

  and then print the test array after calling it

   */
}
