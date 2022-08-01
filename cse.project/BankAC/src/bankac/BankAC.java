package bankac;

public class BankAC {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Zafar", "12567", "Dhaka", 60000);
        BankAccount acc2 = new BankAccount("Akash", "52595", "Sylhet", 70000);
        BankAccount acc3 = new BankAccount("KAmrul", "56694", "Khulna", 90000);
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

    }
}

