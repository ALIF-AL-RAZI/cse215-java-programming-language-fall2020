/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

class GeometricObject {
  private boolean filled;
  private String color;

  public GeometricObject() {

  }

  public GeometricObject(boolean filled, String color) {
    this.filled = filled;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "\ncolor=" + color + "       filled=" + filled + "\n";
  }

}