package SV2.src.q7;

public class Point3D implements Comparable<Point3D> {
  private int x;
  private int y;
  private int z;
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  // [James] perfectly reasonable

  @Override
  public int compareTo(Point3D other) {
    int ret = Integer.compare(this.z, other.z);
    if (ret != 0) {return ret;}

    ret = Integer.compare(this.y, other.y);
    if (ret != 0) {return ret;}

    return Integer.compare(this.x, other.y);
  }
}
