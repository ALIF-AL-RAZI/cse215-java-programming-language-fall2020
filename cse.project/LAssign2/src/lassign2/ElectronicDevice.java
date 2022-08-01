
package lassign2;


public class ElectronicDevice extends Product{
    
    private String model;
    private String warranty;
    
    ElectronicDevice(){
        
    }
    
    public ElectronicDevice(String name, double price, String model, String warranty){
        super(name, price);
        this.model= model;
        this.warranty= warranty;
    }

   
    public String getModel(){
        return model;
        
    }
    
    public String getWarranty(){
        return warranty;
    }
    
    public void setModel(String newModel){
        this.model= newModel;
    }
    
    public void setWarranty(String newWarranty){
        this.warranty= newWarranty;
    }
    
    @Override
    public void changePrice(double percentage){
        System.out.println("10% tax with Electronic device= "+ percentage+" Taka");
    }
    
    @Override
    public String toString(){
        return "ElectronicItem [Name= "+ super.getName()+", Price= "+super.getPrice()+" Taka, Model= "+ getModel()+", Warranty= "+ getWarranty()+" ]";
    }
    
    
    
}
