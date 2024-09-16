package com.corndel.hackulator;

import static com.corndel.hackulator.Divide.divide;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DivideTest {
  @Test
  void dividePositive() {
    assertEquals(divide(15, 3), 5);
  }

  @Test
  void divideNegativeDenominator() {
    assertEquals(divide(15, -3), -5);
  }

  @Test
  void divideNegativeNumerator() {
    assertEquals(divide(-15, 3), -5);
  }

  @Test
  void divideNegativeBoth() {
    assertEquals(divide(-15, -3), 5);
  }

  @Test
  void divideZero() {
    assertEquals(divide(0, 5), 0);
  }

  @Test
  void divideByZero() {
    assertEquals(divide(5, 0), Float.POSITIVE_INFINITY);
  }

  @Test
  void divideZeroByZero() {
    assertEquals(Float.isNaN(divide(0, 0)), true);
  }
}
