package java1;

import java.util.ArrayList;

// Abstract Class 
abstract class Product {
  private String name;
  private double price;

  Product() {

  }

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
  
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  

  // abstract method
  public abstract void changePrice(double percentage);

  @Override
  public abstract String toString();

}

class ClothingItem extends Product {

  private String fabricType;

  ClothingItem() {

  }

  public ClothingItem(String name, double price, String fabricType) {
    super(name, price);
    this.fabricType = fabricType;
  }

  public String getFabricType() {
    return fabricType;
  }

  public void setFabricType(String fabricType) {
    this.fabricType = fabricType;
  }

  @Override
  public void changePrice(double percentage) {
    System.out.println("20% Discount with ClothingItem = " + percentage);
  }

  @Override
  public String toString() {
    return "ClothingItem  [name= " + super.getName() + " Price= " + super.getPrice() + "  fabricType=" + fabricType
        + "]";
  }
}

// ElectronicDevice Class
class ElectronicDevice extends Product {

  private String model;
  private String warranty;

  ElectronicDevice() {

  }

  public ElectronicDevice(String name, double price, String model, String warranty) {
    super(name, price);
    this.model = model;
    this.warranty = warranty;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }

  public void changePrice(double percentage) {
    System.out.println("10% Tax with ElectronicDevice  =" + percentage);
  }

  @Override
  public String toString() {

    return "ElectronicDevice [name= " + super.getName() + " Price= " + super.getPrice() + " model=" + getModel()
        + ", warranty=" + getWarranty() + "]";

  }
}

// Main Class

public class Abstract {
  public static void main(String[] args) {
    Product p1 = new ElectronicDevice("Iphone  ", 2000, "eleven ", "8 months");
    ElectronicDevice p = (ElectronicDevice) p1;
    p.setWarranty("6 months ");
    ClothingItem p2 = new ClothingItem("Shirt", 1000, "Cotton");
    ElectronicDevice p3 = new ElectronicDevice(" Iphone  ", 2000, "eleven", "8 months");
    p3.changePrice(p3.getPrice() + (p3.getPrice() * 0.1));
    p2.changePrice(p2.getPrice() * 0.8);
    System.out.println("Reset Warranty of P1 = " + p.getWarranty());
    ArrayList<Product> producct = new ArrayList<Product>();
    producct.add(p1);
    producct.add(p2);
    producct.add(p3);
    for (int i = 0; i < producct.size(); i++) {
      System.out.println(producct.get(i).toString());

    }

  }
}


