package SV2.src.q9;

public class TryFinallyExperiment {
  public static int x() {
    try {return 6;}
    finally {System.out.println("In finally block"); return 7;}
  }

  public static void main(String[] args) {
    System.out.println(x());
  }
}
