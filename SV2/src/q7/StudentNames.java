package SV2.src.q7;

import java.util.*;

public class StudentNames {
  private HashMap<String, Integer> map = new HashMap<String, Integer>();

  public void add(String name, int percentage) {
    map.put(name, percentage);
  }

  // [James] as a general point of style this should return List<String>, and the map above should have a type of Map<String, Integer>
    // unless (as is not the case) it is *important* what type of underlying list is used
    // This is a classic case of 'code to the interface'
  public ArrayList<String> allNames() {
    ArrayList<String> array = new ArrayList<String>();

    for (String name : map.keySet()) {
      array.add(name);
    }

    array.sort(Comparator.naturalOrder());
    return array;
  }

  public ArrayList<String> topPPercent(float p) {
    ArrayList<String> array = new ArrayList<String>();
    int nStudents = (int)((p / 100f) * (float)map.entrySet().size());
    ArrayList<Map.Entry<String, Integer>> students = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    students.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
    for (int i = 0; i < nStudents; i++) {
      array.add(students.get(i).getKey());
    }
    return array;
  }

  public float median() {
    int idx1 = map.entrySet().size() / 2;
    int idx2 = -1;
    if (map.entrySet().size() % 2 == 0) {
      idx2 = idx1 - 1;
    }
    ArrayList<Map.Entry<String, Integer>> students = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    students.sort(Map.Entry.<String, Integer>comparingByValue());
    int score1;
    int score2;
    score1 = students.get(idx1).getValue();
    if (idx2 == -1) {score2 = score1;}
    else {score2 = students.get(idx2).getValue();}
    return ((float)score1 + (float)score2) / 2;
  }
}
