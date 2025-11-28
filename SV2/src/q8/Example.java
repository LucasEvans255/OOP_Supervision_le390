package SV2.src.q8;

import java.util.List;
import java.util.ArrayList;

public class Example {
  public static void main(String[] args) {
    List<Double> doubles = List.of(1.1, 2.2, 3.3);
    List<Number> numbers = new ArrayList<>();

    addItems(doubles, numbers);
    System.out.println(numbers);
  }

  public static void addItems(List<? extends Number> src, List<? super Number> dest) {
    for (int i = 0; i < src.size(); i++) {
      dest.add(src.get(i));
    }
  }
}
