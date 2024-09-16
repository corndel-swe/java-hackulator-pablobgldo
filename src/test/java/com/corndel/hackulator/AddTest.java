package com.corndel.hackulator;

import static com.corndel.hackulator.Add.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {
  @Test
  void addPositive() {
    assertEquals(add(1, 2), 3);
  }

  @Test
  void addNegative() {
    assertEquals(add(-1, -2), -3);
  }

  @Test
  void addPositiveAndNegative() {
    assertEquals(add(1, -2), -1);
  }

  @Test
  void addZeroes() {
    assertEquals(add(0, 0), 0);
  }

  @Test
  void addBigNumbers() {
    assertEquals(add(123456, 789012), 912468);
  }
}
