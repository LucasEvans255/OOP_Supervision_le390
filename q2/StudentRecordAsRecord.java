package q2;

public record StudentRecordAsRecord (String name, int age, String college) {
  public void print() {
    System.out.printf("Name: %s\nAge: %d\nCollege: %s", name, age, college);
  }
}
