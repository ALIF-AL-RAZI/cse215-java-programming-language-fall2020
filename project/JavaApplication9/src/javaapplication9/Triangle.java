package javaapplication9;
import java.util.*;



public class Triangle extends GeometricObject {
  double sid1 = 1;
  double sid2 = 1;
  double sid3 = 1;

  Triangle() {

  }

  public Triangle(double sid1, double sid2, double sid3) {
    this.sid1 = sid1;
    this.sid2 = sid2;
    this.sid3 = sid3;
  }

  public void setSid1(double sid1) {
    this.sid1 = sid1;
  }

  public double getSid2() {
    return sid2;
  }

  public void setSid2(double sid2) {
    this.sid2 = sid2;
  }

  public double getSid3() {
    return sid3;
  }

  public void setSid3(double sid3) {
    this.sid3 = sid3;
  }

  public double getSid1() {
    return sid1;
  }

  public static double getArea(double sideOne, double sideTwo, double sideThree) {
    double s = (sideOne + sideTwo + sideThree) / 2;
    double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    return area;
  }

  @Override
  public String toString() {
    return " sid1=" + sid1 + "    sid2=" + sid2 + "     sid3=" + sid3 + "\n perimeter of Triangle= "
        + getPerimetr(sid1, sid2, sid3) + "     Area of Triangle= " + getArea(sid1, sid2, sid3) + super.toString();
  }

  public static double getPerimetr(double s1, double s2, double s3) {
    double s = (s1 + s2 + s3);
    return s;
  }

  public static void displayObject(GeometricObject object) {
    System.out.println(object);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Triangle  First Side :");
    double tside1 = input.nextDouble();
    System.out.println("Enter Triangle Second  Side :");
    double tside2 = input.nextDouble();
    System.out.println("Enter Triangle  Third Side :");
    double tside3 = input.nextDouble();
    System.out.println("Enter Triangle color: ");
    String trianglecolor = input.next();
    System.out.println("Enter Triangle Bollen value: ");
    boolean trianglefield = input.nextBoolean();
    System.out.println("Enter Rectangle width: ");
    double width = input.nextDouble();
    System.out.println("Enter Rectangle height: ");
    double height = input.nextDouble();
    System.out.println("Enter Rectangle color: ");
    String rectanglecolor = input.next();
    System.out.println("Enter Rectangle Bollen value: ");
    boolean rectanglefield = input.nextBoolean();
    GeometricObject triangle = new Triangle(tside1, tside2, tside3);
    GeometricObject rectangle = new Rectangle(width, height);
    triangle.setColor(trianglecolor);
    triangle.setFilled(trianglefield);
    rectangle.setColor(rectanglecolor);
    rectangle.setFilled(rectanglefield);
    displayObject(triangle);
    displayObject(rectangle);

  }

}
