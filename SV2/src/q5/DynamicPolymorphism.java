package SV2.src.q1;


// [James] Not 100% sure what this applies to?
class Person {
  public void work() {
    System.out.println("Working");
  }
}

class Student extends Person {
  @Override
  public void work() {
    System.out.println("Studying");
  }
}

public class DynamicPolymorphism {
  public static void make_work(Person p) {
    p.work();
  }

  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();
    make_work(p);
    make_work(s);
  }
}
