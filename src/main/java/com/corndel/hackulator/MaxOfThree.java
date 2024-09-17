package com.corndel.hackulator;

public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {
    if (x > y && x > z) {
      return x;
    }

    if (y > z && y > x) {
      return y;
    }

    if (z > x && z > y) {
      return z;
    }

    if (x == y && y == z) {
      return z;
    }

    if (x == z) {
      return x > y ? x : y;
    } else if (x == y) {
      return x > z ? x : z;
    } else if (y == z) {
      return y > x ? y : x;
    }

  }
}
