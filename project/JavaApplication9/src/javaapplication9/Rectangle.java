
package javaapplication9;


class Rectangle extends GeometricObject {
  double width = 1;
  double height = 1;

  Rectangle() {

  }

  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;

  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeght() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public static double getArea(double width, double height) {
    double area = width * height;
    return area;
  }

  public static double getPerimeter(double width, double height) {
    double perimeter = 2 * (width + height);
    return perimeter;
  }

  @Override
  public String toString() {
    return " Rectangle Width = " + width + " Rectngle  Height= " + height + "\n Area of Rectangle="
        + getArea(width, height) + "          Perimeter of Rectangle=" + getPerimeter(width, height) + super.toString();
  }
}