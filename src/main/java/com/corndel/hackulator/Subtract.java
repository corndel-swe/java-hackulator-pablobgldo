package com.corndel.hackulator;

public class Subtract {
  /**
   * Returns the positive difference (or zero)
   *
   * <p>subtract(5, 2) => 3
   *
   * <p>subtract(3, 7) => 4
   *
   * <p>subtract(5, 5) => 0
   *
   * <p>subtract(-2, 4) => 6
   */
  static int subtract(int x, int y) {
    if (x < y) {
      return y - x;
    }

    if (y < x) {
      return x - y;
    }

    return 0;
  }
}
