package geomatricobject;

//import static geomatricobject.Triangle.getPerimeter;

public class Rectangle extends GeomatricObject{
    double side1;
    double side2;
    
    
    public Rectangle(){
        
    }
    
    public Rectangle(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
        
    }
    
    public double getside1(){
        return side1;
    }
    
    public void setside1(double side1){
        this.side1=side1;
    }
      
    public void setside2(double side2){
        this.side2=side2;
    }
    
    public double getside2(){
        return side2;
    }
    
 
    
    public static double getPerimeter(double side1, double side2){
        double s = 2*(side1 + side2);
        return s;
    }
    
    public double getArea(double side1, double side2){
        double area = side1*side2;     
        return area;
    }
    
    @Override
    public String toString(){
        return "\n\nSide 1: "+side1+"   Side 2: "+side2+"\nArea of Rectangle: "+getArea(side1,side2)+"\nPerimeter of Rectangle: "+getPerimeter(side1,side2)+super.toString();
    }
}

