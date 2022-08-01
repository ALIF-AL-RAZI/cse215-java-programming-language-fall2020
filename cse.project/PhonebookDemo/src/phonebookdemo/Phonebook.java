
package phonebookdemo;


class Phonebook{
    private Contact[] contacts = new Contact[3];
    private int size;
    int p = 0;
  

    public Phonebook(int capacity){
        
        this.size = capacity;
    }

    public int getSize(){
        return size;
    }

    public String getIndex(String name){
        return name;
    }

    boolean a;

    public boolean addContact(Contact c){
        contacts[p++] = c;
        if (size> contacts.length){
            a= true;
        } 
        else
            a= false;
    return a;
    }

    public void viewAllContacts(){
        System.out.println();
        System.out.println("All contacts are:");

        for (int i= 0; i< contacts.length; i++){
            System.out.println(contacts[i]);
        }
        System.out.println();
    }

    public void viewEmergencyContacts(){
        for (int i= 0; i< contacts.length; i++){
            if (contacts[i].isEmergency() == true){
                System.out.println("Emergency contacts are: " + contacts[i]);
            }
        }
    }

    public String viewContact(String name){
        for (int i= 0; i< contacts.length; i++){
            if (contacts[i].getName().equals(name)){
                System.out.println("Match Contact= " + contacts[i]);
            }
        }

        return "";
    }

    boolean b;

    public boolean deleteContact(String name){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equals(name)) {
                for (int j = i; j < contacts.length - 1; j++) {
                    contacts[j] = contacts[j + 1];
                    b= true;
                    p = contacts[j].getName().toCharArray().length;
                    }
                }
            }
        return b;
    }

    public boolean deleteContact(int index){
        String[] copy = new String[contacts.length - 1];
        for (int i = 0, j= 0; i< p; i++){
            if (i != index){
                copy[j++] = contacts[i].getName();
                b= true;
            } 
            else
                b= false;
        }
        return b;
    }

    public void deleteAll(){
        contacts = null;
        System.out.println("All Contacts have been deleted: "+ contacts);
    }

    public boolean isEmpty(){
        if(contacts== null)
            return true;
        else
            return false;
    }
    
    public boolean isFull(){
        if(contacts== null)
            return false;
        else
            return true;
    } 

}
