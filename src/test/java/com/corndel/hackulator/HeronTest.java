package com.corndel.hackulator;

import static com.corndel.hackulator.Heron.heron;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HeronTest {
  @Test
  void heronRightTriangle() {
    assertEquals(heron(3, 4, 5), 6);
  }

  @Test
  void heronScaleneTriangle() {
    assertEquals(heron(4, 13, 15), 24);
  }
}
