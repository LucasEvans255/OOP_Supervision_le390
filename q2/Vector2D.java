package q2;

public class Vector2D {
  private float x = 0;
  private float y = 0;

  public Vector2D(float x_coord, float y_coord) {
    x = x_coord;
    y = y_coord;
  }

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
