package busybuilders;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author botto
 */
public class SalesTransaction {
    
    //declare ID generator
    private static int idGen = 0;
   
    
    //declare instance variables
    private int txID;
    private Date salesDate;
    private ArrayList<Inventory> salesItems;
    private double txTotal;
    //int txID, Date saesDate, ArrayList<Inventory>, double txTotal
    
    //no-arg constructor methods
    public SalesTransaction(){
        idGen++;
        this.txID = idGen;
        this.salesItems = new ArrayList<Inventory>();
    }
    
    
    //Overloaded SalesTransaction Constructor - takes data entered on form in gui
    public SalesTransaction(Date d, double txt){
        idGen++;
        this.txID = idGen;
        this.salesDate = d;
        this.txTotal = txt;   
        this.salesItems = new ArrayList<Inventory>();
    }
    
    //Accessor methods
    public int getTXID(){ return this.txID; }
    public Date getSalesDate(){ return this.salesDate; }
    public ArrayList<Inventory> getSalesItems(){ return this.salesItems; }
    public Double getTXTotal(){ return this.txTotal; }
    
    
    //Mutator Methods
    public void setTXID(int val){ this.txID = val; }
    public void setSalesDate(Date val){ this.salesDate= val; }
    public void setSalesItems(ArrayList<Inventory> val){ this.salesItems = val; }
    public void setTXTotal(Double val){ this.txTotal = val; }
    
    
    public String toString(){
        return  getTXID() + "\n" +
                getSalesDate() + "\n" +
                getSalesItems() + "\n" +
                getTXTotal() + "\n" +
                "**********************\n";
    }
    
}//end class SalesTransaction