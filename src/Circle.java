/**
 * Circle.java
 *
 * This is a circle class
 *
 * @author axu5 <github.com/axu5>
 * @version 28.01.2022
 */
public class Circle {
  private double radius = 1.0;
  private String color = "red";

  Circle() {

  }

  Circle(double radius) {
    this.radius = radius;
  }

  Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "r=" + radius + ", color=" + color;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}