/**
 * Cylinder.java
 *
 * Cylinder is the subclass of circle, since it extends the circle class.
 * 
 * Important properties that it needs: radius, height
 *
 * @author axu5 <github.com/axu5>
 * @version 31.01.2022
 */
public class Cylinder extends Circle {
  private double height = 1.0;

  Cylinder() {
    super();
  }

  Cylinder(double height) {
    super();
    this.height = height;
  }

  Cylinder(double height, double radius) {
    super(radius);
    this.height = height;
  }

  Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String toString() {
    return "h=" + this.height + ", " + super.toString();
  }

  public double getVolume() {
    return super.getArea() * height;
  }
}