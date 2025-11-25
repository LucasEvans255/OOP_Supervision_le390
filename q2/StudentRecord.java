package q2;

public class StudentRecord {
  private final String name;
  private final int age;
  private final String college;

  public StudentRecord(String name, int age, String college) {
    this.name = name;
    this.age = age;
    this.college = college;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // [James] getCollege() for camelCase convention
  public String GetCollege() {
    return college;
  }

  public void print() {
    System.out.printf("Name: %s\nAge: %d\nCollege: %s", name, age, college);
  }
}
