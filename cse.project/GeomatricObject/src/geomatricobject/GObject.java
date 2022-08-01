package geomatricobject;
import java.util.*;


public class GObject {
    public static void displayObject(GeomatricObject object) {
    System.out.println(object);
    }

    public static void main(String[] args) {
        Triangle Object= new Triangle();
        Rectangle object= new Rectangle();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of Triangle: ");
        double t1 = input.nextDouble();
        System.out.print("\nEnter side 2 of Triangle: ");
        double t2 = input.nextDouble();
        System.out.print("\nEnter side 3 of Triangle: ");
        double t3 = input.nextDouble();
        System.out.print("\nEnter color of Triangle: ");
        String c = input.next();
        System.out.print("\nEnter color condition of Triangle: ");
        boolean b = input.nextBoolean();
        
        
        Object.side1=t1;
        Object.side2=t2;
        Object.side3=t3;
        Object.setColor(c);
        Object.setfilled(b);
        
        Scanner inp = new Scanner(System.in);
        System.out.print("\nEnter side 1 of Rectangle: ");
        double r1 = inp.nextDouble();
        System.out.print("\nEnter side 2 of Rectangle: ");
        double r2 = inp.nextDouble();
        System.out.print("\nEnter color of Triangle: ");
        String c2 = inp.next();
        System.out.print("\nEnter color condition of Triangle: ");
        boolean b2 = inp.nextBoolean();
        
        
        object.side1=r1;
        object.side2=r2;
        object.setColor(c2);
        object.setfilled(b2);
        
        displayObject(Object);
        displayObject(object);
        
    }
    
}
