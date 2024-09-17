package com.corndel.hackulator;

public class Heron {

  /**
   * Uses Heron's formula to calculate the area of a triangle with sides of length a, b, c
   * https://en.wikipedia.org/wiki/Heron%27s_formula
   */
  static double heron(double a, double b, double c) {
    var s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
}
