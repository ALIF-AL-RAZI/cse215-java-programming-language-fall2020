package trycatchexample;

import java.util.*;

public class TryCatchExample {

    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your name: ");
                String name = input.nextLine();
                
                System.out.println("Enter your age: ");
                String age = input.nextLine();
                String h="hu";
                int a= Integer.parseInt(age);
                
                System.out.println("Your name is: " + name);
                System.out.println("Your age is: " + a);
                count=2;
            } catch (Exception e) {
                System.out.println("You did not input your age correctly./nWrite your age correctly." + e);
            }
        } while (count == 1);
    }

}
