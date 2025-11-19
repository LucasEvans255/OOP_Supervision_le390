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
}
