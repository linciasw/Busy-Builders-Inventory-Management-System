package busybuilders;
import java.util.*;
/**
 *
 * @author botto
 */
public class Supplier {
    
    //declare ID generator
    private static int idGen = 0;

    static Supplier parseSupplier(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /*
    static Supplier parseSupplier(String text) {
        return null;
    }*/
    
    
    //declare instance variables
    private int sID;
    private String sName;
    private String sContact;
    private Double sCredit;
 
    
    
    //no-arg constructor methods
    public Supplier(){
        idGen++;
        this.sID = idGen;
    }
    
    
    //Overloaded Employee Constructor - takes data entered on form in gui
    public Supplier(int id, String n, String co, Double cr){
        idGen++;
        this.sID = id;
        this.sName = n;
        this.sContact = co;
        this.sCredit = cr;     
    }
    
    //Accessor methods
    public int getSID(){ return this.sID; }
    public String getSName(){ return this.sName; }
    public String getSContact(){ return this.sContact; }
    public Double getSCredit(){ return this.sCredit; }

    
    //Mutator Methods
    public void setSID(int val){ this.sID = val; }
    public void setSName(String val){ this.sName= val; }
    public void setSContact(String val){ this.sContact = val; }
    public void setSCredit(Double val){ this.sCredit = val; }
    
    
    //toString 
    public String toString(){
        return  this.sID +": Name -"+
                this.sName + "\n" +
                this.sContact + "\n" +
                this.sCredit + "\n" +
                //this.sName.toUpperCase() + "\n" +
                        "*********************\n";
    }
    
}//end class Supplier