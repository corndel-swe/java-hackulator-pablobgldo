package com.corndel.hackulator;

import static com.corndel.hackulator.Power.power;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PowerTest {
  @Test
  void powerPositive() {
    assertEquals(power(2, 3), 8);
  }

  @Test
  void powerOfZero() {
    assertEquals(power(2, 0), 1);
  }

  @Test
  void powerOfOne() {
    assertEquals(power(5, 1), 5);
  }

  @Test
  void powerZero() {
    assertEquals(power(0, 3), 0);
  }

  @Test
  void powerNegativeEven() {
    assertEquals(power(-2, 4), 16);
  }

  @Test
  void powerNegativeOdd() {
    assertEquals(power(-2, 3), -8);
  }
}
