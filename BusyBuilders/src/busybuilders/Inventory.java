package busybuilders;
import java.util.*;
/**
 *
 * @author botto
 */
public class Inventory {

    private static int idGen = 100000;
    
    private int invID;
    private String iName;
    //private String iDesc;
    private String iCateg;
    private Double iUnitCost;
    private int iReorderLev;
    private int iStockLev;
    //private Supplier iSupplier;
    private int iQty;

    //int, string, string, double, int, int, supplier, 
    
    //no-arg constructor method
    public Inventory(){
        idGen++;
        this.invID = idGen;
    }
    
    //Overloaded Inventory Constructor
    public Inventory(int id, String n, String c, Double uc, int rl, int sl, int q){
        idGen++;
        this.invID = id;
        this.iName = n;
        //this.iDesc = de;
        this.iCateg = c;
        this.iUnitCost = uc;
        this.iReorderLev = rl;
        this.iStockLev = sl;
        //this.iSupplier = s;
        this.iQty = q;
    }

    //Accessor Methods
    public int getInvID(){ return this.invID; }
    public String getIName(){ return this.iName; }
    //public String getIDesc(){ return this.iDesc; }
    public String getICateg(){ return this.iCateg; }
    public double getIUnitCost(){ return this.iUnitCost; }
    public int getIReorderLevel(){ return this.iReorderLev; }
    public int getIStockLevel(){ return this.iStockLev; }
    //public Supplier getISupplier(){ return this.iSupplier; }
    public int getIQuantity(){ return this.iQty; }
    
    //Mutator Methods
    public void setInvID(int val){ this.invID = val; }
    public void setIName(String val){ this.iName = val; }
    //public void setIDesc(String val){ this.iDesc = val; }
    public void setICateg(String val){ this.iCateg = val; }
    public void setIUnitCost(double val){ this.iUnitCost = val; }
    public void setIReorderLevel(int val){ this.iReorderLev = val; }
    public void setIStockLevel (int val){ this.iStockLev = val; }
    //public void setISupplier (Supplier val){ this.iSupplier = val; }
    public void setIQuantity (int val){ this.iQty = val; }

    
    public String toString(){
        return  getInvID() + "\n" +
                getIName() + "\n" +
                //getIDesc() + "\n" +
                getIUnitCost() + "\n" +
                getIQuantity() + "\n" +
                //getISupplier() + "\n" +
                "**********************\n";
    }
    
}//end class Inventory