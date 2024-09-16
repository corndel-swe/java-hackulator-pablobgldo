package com.corndel.hackulator;

import static com.corndel.hackulator.Average.average;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
  @Test
  void averagePositive() {
    assertEquals(average(4, 6), 5);
  }

  @Test
  void averagePositiveNegative() {
    assertEquals(average(4, -2), 1);
  }

  @Test
  void averageNegative() {
    assertEquals(average(-4, -6), -5);
  }

  @Test
  void averageSymmetrical() {
    assertEquals(average(0, 6), 3);
    assertEquals(average(6, 0), 3);
  }

  @Test
  void averageZero() {
    assertEquals(average(0, 0), 0);
  }

  @Test
  void averageBigNumbers() {
    assertEquals(average(1000000, 2000000), 1500000);
  }
}
