package SV3.src.q11;

import java.util.*;

public class StringUtils {
  public static void main(String[] args) {
    List<String> words = List.of("apple", "banana", "cherry");

    words.forEach(System.out::println);

    List<Integer> lengths = words.stream()
      .map(String::length)
      .toList();

    List<String> copies = words.stream()
      .map(String::new)
      .toList();
  }
}
