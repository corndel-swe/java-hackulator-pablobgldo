package com.corndel.hackulator;

import static com.corndel.hackulator.Subtract.subtract;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtractTest {
  @Test
  void firstNumberIsLarger() {
    assertEquals(subtract(5, 2), 3);
  }

  @Test
  void secondNumberIsLarger() {
    assertEquals(subtract(3, 7), 4);
  }

  @Test
  void bothNumbersAreEqual() {
    assertEquals(subtract(5, 5), 0);
  }

  @Test
  void bothNumbersAreNegative() {
    assertEquals(subtract(-5, -2), 3);
  }

  @Test
  void positiveAndNegative() {
    assertEquals(subtract(-3, 7), 10);
  }

  @Test
  void bigNumbers() {
    assertEquals(subtract(123456, 789012), 665556);
  }
}
