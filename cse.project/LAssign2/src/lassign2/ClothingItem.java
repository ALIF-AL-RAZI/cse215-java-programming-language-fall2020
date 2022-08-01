
package lassign2;


public class ClothingItem extends Product{
    
    private String fabricType;
    
    ClothingItem(){
        
    }
    
    public ClothingItem(String name, double price, String fabricType){
        super(name, price);
        this.fabricType= fabricType;
    }

    public String getFabricType(){
        return fabricType;
    }
    
    public void setFabricType(String newFabricType){
        this.fabricType= newFabricType;
    }
    
    @Override
    public void changePrice(double percentage){
        System.out.println("20% discount with clothing item price= "+percentage+ " Taka");
    }
    
    @Override
    public String toString(){
        return "ClothingItem [Name= "+ super.getName()+", Price= "+super.getPrice()+" Taka, Fabric Type= "+ fabricType+" ]";
    }
    
    
}
