package SV2.src.q7.Car;

public class Car implements Comparable {
  private String manufacturer;
  private int age;

  public Car(String manufacturer, int age) {
    this.manufacturer = manufacturer;
    this.age = age;
  }

  public String getManufacturer() {return this.manufacturer;}

  public int getAge() {return this.age;}
  
  @Override
  public int compareTo(Object other) {
    Car otherCar = (Car)other;
    int ret = this.manufacturer.compareTo(otherCar.manufacturer);
    if (ret != 0) {return ret;}
    return Integer.compare(this.age, otherCar.age);
  }
}
