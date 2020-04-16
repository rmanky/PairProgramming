package edu.wpi.teamname;

public class Rectangle {
  private final double length;
  private final double height;

  public Rectangle(double length, double height) {
    this.length = length;
    this.height = height;
  }

  public double getPerimeter() {
    return 2 * length + 2 * height;
  }

  public double getArea() {
    return length * height;
  }
}
