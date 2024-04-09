package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for Calculator.
 */
public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.add(2, 3));
  }

  @Test
  public void testSubtract() {
    Calculator calculator = new Calculator();
    assertEquals(2, calculator.subtract(5, 3));
  }

  @Test
  public void testMultiply() {
    Calculator calculator = new Calculator();
    assertEquals(15, calculator.multiply(3, 5));
  }

  @Test
  public void testDivide() {
    Calculator calculator = new Calculator();
    assertEquals(2.0, calculator.divide(10, 5), 0.0001);
  }

  @Test
  public void testDivideByZero() {
    Calculator calculator = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
  }
}
