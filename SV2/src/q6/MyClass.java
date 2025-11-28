package SV2.src.q6;

public class MyClass implements Cloneable {
  private String mName;
  private int[] mData;

  public MyClass (MyClass toCopy) {
    this.mName = toCopy.mName;
    this.mData = new int[toCopy.mData.length];
    for (int i = 0; i < toCopy.mData.length; i++) {
      this.mData[i] = toCopy.mData[i];
    }
  }

  public Object clone() {
    MyClass newObj = new MyClass(this);
    return newObj;
  }
}
