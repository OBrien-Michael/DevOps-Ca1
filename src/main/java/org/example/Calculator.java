package org.example;

/**
 * This class represents a simple calculator.
 */
public class Calculator {

  /**
   * Adds two integers.
   *
   * @param a The first integer.
   * @param b The second integer.
   * @return The sum of the two integers.
   *
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * Subtracts one integer from another.
   *
   * @param a The first integer.
   * @param b The second integer.
   * @return The result of subtracting the second integer from the first.
   *
   */
  public int subtract(int a, int b) {
    return a - b;
  }

  /**
   * Multiplies two integers.
   *
   * @param a The first integer.
   * @param b The second integer.
   * @return The product of the two integers.
   *
   */
  public int multiply(int a, int b) {
    return a * b;
  }

  /**
   * Divides one integer by another.
   *
   * @param a The numerator.
   * @param b The denominator.
   * @return The result of dividing the numerator by the denominator.
   * @throws IllegalArgumentException if the denominator is zero.
   *
   */
  public double divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return (double) a / b;
  }
}
