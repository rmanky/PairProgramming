package edu.wpi.teamname;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getPerimeter() {
    return radius * 2 * Math.PI;
  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
