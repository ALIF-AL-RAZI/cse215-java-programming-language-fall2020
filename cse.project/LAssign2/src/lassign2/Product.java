
package lassign2;


public abstract class Product {
    private String name;
    public double price;
    Product(){
        
    }
    
    public Product(String name, double price){
        this.name= name;
        this.price= price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(double price){
        this.price= price;
    }
    
    public void setName(String name){
        this.name= name;
    }
    
    public abstract void changePrice(double percentage);
    
    @Override
    public abstract String toString();
    
    
}
