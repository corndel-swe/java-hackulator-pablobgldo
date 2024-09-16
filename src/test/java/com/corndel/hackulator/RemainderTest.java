package com.corndel.hackulator;

import static com.corndel.hackulator.Remainder.remainder;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemainderTest {
  @Test
  void twoPositiveNumbers() {
    assertEquals(remainder(10, 3), 1);
  }

  @Test
  void secondNumberDividesFirstNumber() {
    assertEquals(remainder(10, 5), 0);
  }

  @Test
  void firstNumberSmallerThanSecondNumber() {
    assertEquals(remainder(3, 10), 3);
  }

  @Test
  void negativeNumbers() {
    assertEquals(remainder(-10, 3), -1);
    assertEquals(remainder(10, -3), 1);
  }

  @Test
  void zero() {
    assertEquals(remainder(0, 1), 0);
  }
}
