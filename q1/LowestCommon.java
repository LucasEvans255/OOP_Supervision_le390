package q1;

class LowestCommon {
  public int lowestCommon(long a, long b) {
    int res = -1;
    for (int i = 0; i < 64; i++) {
      if (a % 2 == b % 2) {  // [James] This is independent of i, so we will always either return 0, or -1
        res = i;
        break;
      }
    }
/*
[James]
long anded = x & y;
...
instead of (a%2 == b%2), consider (((anded >> i) & 1) > 0)  [now includes i in the logic]
 */


    return res;
  }
}
