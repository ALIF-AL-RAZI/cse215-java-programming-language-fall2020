package geomatricobject;

public class GeomatricObject {
    private String color;
    private boolean filled;
    
    public GeomatricObject(){
        
    }
    
    public GeomatricObject(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color= color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setfilled(boolean filled){
        this.filled= filled;
    }
    
    @Override
    public String toString(){
        return "\nColor: "+ color+"    Filled: "+ filled;
    }
    
    
}
