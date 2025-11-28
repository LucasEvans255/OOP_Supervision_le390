package SV2.src.q7.File;

import java.io.*;
import java.util.*;

public class FileReaderSorter {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("data.txt");

    Scanner s = new Scanner(f);
    ArrayList<Map.Entry<Integer, Integer>> array = new ArrayList<>();

    while (s.hasNextLine()) {
      String line = s.nextLine();
      String[] ints = line.split(",");
      int int1 = Integer.parseInt(ints[0]);
      int int2 = Integer.parseInt(ints[1]);
      array.add(Map.entry(int1, int2));
    }

    array.sort(Map.Entry.<Integer, Integer>comparingByKey().thenComparing(Map.Entry.<Integer, Integer>comparingByValue()));
    
    for (Map.Entry<Integer, Integer> entry : array) {
      System.out.println(String.format("%d, %d", entry.getKey(), entry.getValue()));
    }
  }
}
