package bankac;

public class BankAccount {

    private String name;
    private String address;
    private String accountID;
    private double balance;

    public BankAccount() {
    }
    
    public BankAccount(String n, String i, String a, double c) {
        this.name = n;
        this.accountID = i;
        this.address = a;
        this.balance = c;
        
  }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String i) {
        this.accountID = i;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double c) {
        this.balance = c;
    }

    public void addInterest() {
        this.balance = this.balance + (this.balance * 0.07);
        System.out.println("Balance with Interest 7%: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount: \nName: " + name + ", Account ID: " + accountID + ", Address: " + address + ", Balance: " + balance;
    }

}
