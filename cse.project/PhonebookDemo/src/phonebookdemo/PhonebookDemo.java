
package phonebookdemo;


public class PhonebookDemo {

    
    public static void main(String[] args) {
        
        Phonebook pb = new Phonebook(5);

        Contact c1 = new Contact("Salam", "01621796745", true);
        Contact c2 = new Contact("Azad", "01628217722", true);
        Contact c3 = new Contact("SF", "01400227578", false);
        
        pb.addContact(c1);
        pb.addContact(c2);
        pb.addContact(c3);
        pb.viewAllContacts();
    

        System.out.println("Delete contact by name: Rafiq ~" + pb.deleteContact("Rafiq"));
        System.out.println("Delete contact by name: Azad ~" + pb.deleteContact("Azad"));
        
        Contact c4 = new Contact("Hanif", "01811431042", true);

        pb.addContact(c4);
        pb.viewAllContacts();

        pb.viewEmergencyContacts();
        
        System.out.println();
        pb.deleteAll();
        
        System.out.println();
        System.out.println("Contact list is Full: " + pb.isFull());
        
        System.out.println();
        System.out.println("Contact list is empty: " + pb.isEmpty());
  }
}