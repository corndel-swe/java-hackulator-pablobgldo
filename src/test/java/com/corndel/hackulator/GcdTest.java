package com.corndel.hackulator;

import static com.corndel.hackulator.Gcd.gcd;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GcdTest {
  @Test
  void gcdTwoPositive() {
    assertEquals(gcd(8, 12), 4);
    assertEquals(gcd(10, 45), 5);
  }

  @Test
  void gcdMultiple() {
    assertEquals(gcd(5, 10), 5);
  }

  @Test
  void gcdCoprime() {
    assertEquals(gcd(13, 17), 1);
  }

  @Test
  void gcdBig() {
    assertEquals(gcd(1701, 3786), 3);
  }
}
