
package lassign2;
import java.util.ArrayList;

public class LAssign2 {

    
    public static void main(String[] args) {
        Product p1= new ElectronicDevice("Laptop", 405000,"ASUS ROG ZEPHYRUS DUO 15", "1 year");
        
        ElectronicDevice p= (ElectronicDevice) p1;
        p.setWarranty("6 months");
        
        ClothingItem p2= new ClothingItem("Jacket", 5000, "Leather");
        
        ElectronicDevice p3= new ElectronicDevice("Laptop", 405000,"ASUS ROG ZEPHYRUS DUO 15", "1 year");
        
        p2.changePrice(p2.getPrice()-(p2.getPrice()*20/100));
        
        p3.changePrice(p3.getPrice()+p.getPrice()*.1);
        
        System.out.println("New Warranty of E. Device: "+ p.getWarranty());
        
        ArrayList <Product> product= new ArrayList<Product>();
        product.add(p1);
        product.add(p2);
        product.add(p3);
        
        for(int i= 0; i<product.size(); i++){
            System.out.println(product.get(i).toString());
        }
        
    }
    
}
