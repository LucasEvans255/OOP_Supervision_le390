package SV3.src.q11.Book;

import java.util.*;
import java.util.stream.*;

public class Library {
  public static void main(String[] args) {
    List<Book> library = List.of(
        new Book("Moby Dick", "Herman Melville", 720),
        new Book("1984", "George Orwell", 328),
        new Book("Ulysses", "James Joyce", 730),
        new Book("War and Peace", "leo Tolstoy", 1225)
        );

    List<Book> filteredAndSorted = 
      library.stream()
              // [James] cast to Book is redundant, as that is the type of the Stream
      .filter((Book book) -> book.pages() > 500)
      .sorted(Comparator.comparing(Book::title))
      .collect(Collectors.toList());
    
    for (Book b : filteredAndSorted) {
      System.out.println(b.title());
    }
  }
}
