/*-------------------------*/
/* DO NOT DELETE THIS TEST */
/*-------------------------*/
package edu.wpi.teamname;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DefaultTest {

  @Test
  public void testRectanglePerimeter() {
    Rectangle rec = new Rectangle(20, 30);
    double calculated = (20 * 2) + (30 * 2);
    assertEquals(calculated, rec.getPerimeter(), "Should be equal");
  }

  @Test
  public void testRectangleArea() {
    Rectangle rec = new Rectangle(20, 30);
    double calculated = 20 * 30;
    assertEquals(calculated, rec.getArea(), "Should be equal");
  }

  @Test
  public void testCirclePerimeter() {
    Circle circle = new Circle(5);
    double calculated = 5 * 2 * Math.PI;
    assertEquals(calculated, circle.getPerimeter(), "Should be equal");
  }

  @Test
  public void testCircleArea() {
    Circle circle = new Circle(3);
    double calculated = Math.pow(3, 2) * Math.PI;
    assertEquals(calculated, circle.getArea(), "Should be equal");
  }

  @Test
  public void testFizz() {
    FizzBuzz buzz = new FizzBuzz();
    assertEquals("fizz", buzz.answer(6), "Should return fizz");
  }

  @Test
  public void testBuzz() {
    FizzBuzz buzz = new FizzBuzz();
    assertEquals("buzz", buzz.answer(20), "Should return buzz");
  }

  @Test
  public void testFizzBuzz() {
    FizzBuzz buzz = new FizzBuzz();
    assertEquals("fizzbuzz", buzz.answer(15), "Should return fizzbuzz");
  }

  @Test
  public void testFizzBuzzString() {
    FizzBuzz buzz = new FizzBuzz();
    assertEquals("13", buzz.answer(13), "Should return 13");
  }

  @Test
  public void testWiz() {
    FizzBuzzWhiz buzz = new FizzBuzzWhiz();
    assertEquals("whiz", buzz.answer(17), "Should return wiz");
  }
}
