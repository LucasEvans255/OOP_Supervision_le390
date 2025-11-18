package q1;

class LowestCommon {
  public int lowestCommon(long a, long b) {
    int res = -1;
    for (int i = 0; i < 64; i++) {
      if (a % 2 == b % 2) {
        res = i;
        break;
      }
    }

    return res;
  }
}
