
package assignment3;


class Contact{
    private String name;
    private String phoneno;
    private boolean emergency;
    
    public Contact (){
        
    }

    public Contact(String name, String phoneno, boolean emergency){
        
        this.name = name;
        this.phoneno = phoneno;
        this.emergency = emergency;
    }
    
    public boolean isEmergency(){
        
        return emergency;
    }

    public String getName() {
        return name;
    }


    public String getPhoneno() {
        return phoneno;
    }

    public void setEmergency(boolean flag) {
        this.emergency = flag;
    }

    public void copy(String c) {
        System.out.println(c);
    }

    @Override
        public String toString() {
        return "Contact [name= " + name + " Phone number= " + phoneno + " Emergency= " + emergency + " ]";
    }

}