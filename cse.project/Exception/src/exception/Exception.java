
package exception;

class readInteger{
    String s;
    int i;
    public readInteger(){
        
    }
    
    public readInteger(String s){
        this.s=s;
        
        if(s.indexOf(".")>=0){
            i= Integer.parseInt(s);
        }
        
        
    }
    
    public int readInteger() throws EitaIntegerNoiException{
        
        
    }
    
    
   
    
}


public class Exception {
    
    

  
    public static void main(String[] args) {
        
    }
    
}
