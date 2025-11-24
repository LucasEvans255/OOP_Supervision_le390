float[][] identityN(int n) {
  float[][] ret = new float[n][n];
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (i == j) {
        ret[i][j] = 1;
      } else {
        ret[i][j] = 0;
      }
    }
  }
}

void transpose(float[][] m) {
  int n = m.length;
  float temp;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      temp = m[i][j];
      m[i][j] = m[j][i];
      m[j][i] = temp;
    }
  }
}

/*
 [James] you cannot have code outside of a class in java [well...not like this at least]

 You need to add in the structure of

 public class Matrix }

    ... then add your code here
    public static float[][] transpose....
       [return value of float[][] here implies this would not change the original matrix, but return a new one..void is also fine]



 }
 */
