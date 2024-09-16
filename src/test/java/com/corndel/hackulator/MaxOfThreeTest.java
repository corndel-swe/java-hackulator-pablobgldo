package com.corndel.hackulator;

import static com.corndel.hackulator.MaxOfThree.maxOfThree;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxOfThreeTest {
  @Test
  void maxTest() {
    assertEquals(maxOfThree(1, 5, 3), 5);
  }

  @Test
  void maxFirst() {
    assertEquals(maxOfThree(10, 5, 7), 10);
  }

  @Test
  void maxMiddle() {
    assertEquals(maxOfThree(4, 12, 9), 12);
  }

  @Test
  void maxLast() {
    assertEquals(maxOfThree(3, 6, 8), 8);
  }

  @Test
  void maxHandlesNegative() {
    assertEquals(maxOfThree(-1, -5, -3), -1);
  }

  @Test
  void maxHandlesMixOfPositiveAndZeroAndNegative() {
    assertEquals(maxOfThree(-2, 0, 5), 5);
  }

  @Test
  void maxHandlesAllSameNumber() {
    assertEquals(maxOfThree(7, 7, 7), 7);
  }

  @Test
  void maxHandlesDupes() {
    assertEquals(maxOfThree(2, 8, 8), 8);
    assertEquals(maxOfThree(8, 8, 2), 8);
    assertEquals(maxOfThree(8, 2, 8), 8);
  }
}
