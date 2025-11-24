package q2;

public class Vector2D {
  private float x = 0;
  private float y = 0;


  // [James] This is effectively an immutable class - as there is no way to amend x, y once the Object is created
    // For a mutable Class we need setters as well, and the add method should then have a signature like:
    // public void add(Vector2D v) {...} that updates this.x and this.y

  public Vector2D(float x_coord, float y_coord) {
    x = x_coord;
    y = y_coord;
  }

  // James] getX() for camelCase convention
  public float GetX() {
    return x;
  }

  public float GetY() {
    return y;
  }

  public Vector2D add(Vector2D v) {
    return new Vector2D(x + v.GetX(), y + v.GetY());
  }

  public float dot(Vector2D v) {
    return x * v.GetX() + y * v.GetY();
  }

  public float magnitude() {
    return (float)Math.sqrt((double) (x * x + y * y));
  }

  public Vector2D normalise() {
    float magnitude = magnitude();
    return new Vector2D(x / magnitude, y / magnitude);
  }
}
