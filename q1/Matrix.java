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
