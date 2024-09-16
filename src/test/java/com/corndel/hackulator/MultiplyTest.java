package com.corndel.hackulator;

import static com.corndel.hackulator.Multiply.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyTest {
  @Test
  void multiplyPositive() {
    assertEquals(multiply(2, 3), 6);
  }

  @Test
  void multiplyPositiveNegative() {
    assertEquals(multiply(2, -3), -6);
  }

  @Test
  void multiplyNegative() {
    assertEquals(multiply(-2, -3), 6);
  }

  @Test
  void multiplyZero() {
    assertEquals(multiply(0, 5), 0);
    assertEquals(multiply(5, 0), 0);
  }

  @Test
  void multiplyOne() {
    assertEquals(multiply(5, 1), 5);
    assertEquals(multiply(1, 5), 5);
  }

  @Test
  void multiplyLargeNumber() {
    assertEquals(multiply(123456, 789012), 97408265472L);
  }
}
