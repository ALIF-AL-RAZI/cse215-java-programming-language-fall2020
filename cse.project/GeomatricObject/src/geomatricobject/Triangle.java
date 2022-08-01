package geomatricobject;

//import static geomatricobject.Rectangle.getPerimeter;

public class Triangle extends GeomatricObject{
    double side1;
    double side2;
    double side3;
    
    public Triangle(){
        
    }
    
    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
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
    
    public void setside3(double side3){
        this.side3=side3;
    }
    
    public double getside3(){
        return side3;
    }
    
    public static double getPerimeter(double side1, double side2, double side3){
        double s = (side1 + side2 + side3);
        return s;
    }
    
    public double getArea(double side1, double side2, double side3){
        double s= (side1 + side2 + side3)/2;
        double area = Math.sqrt(s* (s - side1) * (s- side2) * (s- side3));     
        return area;
    }
    
    @Override
    public String toString(){
        return "\n\nSide 1: "+side1+"   Side 2: "+side2+"   Side 3: "+side3+"\nArea of Triangle: "+getArea(side1,side2,side3)+"\nPerimeter of Triangle: "+getPerimeter(side1,side2,side3)+super.toString();
    }
}
