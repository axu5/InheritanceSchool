/**
 * TestCylinder.java
 *
 * A test driver for the Cylinder class.
 *
 * @author axu5 <github.com/axu5>
 * @version 31.01.2022
 */
public class TestCylinder {
  public static void main(String[] _args) {
    var cy1 = new Cylinder();
    System.out.println(
        "Radius is " + cy1.getRadius()
            + " Height is " + cy1.getHeight()
            + " Color is " + cy1.getColor()
            + " Base area is " + cy1.getArea()
            + " Volume is " + cy1.getVolume());

    var cy2 = new Cylinder(5.0, 2.0);
    System.out.println(
        "Radius is " + cy2.getRadius()
            + " Height is " + cy2.getHeight()
            + " Color is " + cy2.getColor()
            + " Base area is " + cy2.getArea()
            + " Volume is " + cy2.getVolume());
  }
}