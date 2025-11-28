package SV2.src.q7.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
  @Override
  public int compare(Car car1, Car car2) {
    int ret = car1.getManufacturer().compareTo(car2.getManufacturer());
    if (ret != 0) {return ret;}
    return Integer.compare(car1.getAge(), car2.getAge());
  }
}
