package busybuilders;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author botto
 */
public class IMSAppController {
    
    //Declare ArrayList Collection Objects
    ArrayList<Employee> eList = new ArrayList<Employee>();
    ArrayList<Supplier> sList = new ArrayList<Supplier>();
    ArrayList<Inventory> iList = new ArrayList<Inventory>();
    ArrayList<SalesTransaction> stxList = new ArrayList<SalesTransaction>();
    
    //Object references
    Employee eObj = null;
    Supplier sObj = null;
    Inventory iObj = null;
    SalesTransaction stxObj = null;
    
    SimpleDateFormat d = new SimpleDateFormat("dd,mm,yyyy");
    
    //No-Arg Constructor method
    public IMSAppController(){}
    
    //Accessors for ArrayList Collections
    public ArrayList<Employee> getEList(){
        return this.eList;
    }
    public ArrayList<Supplier> getSList(){
        return this.sList;
    }
    public ArrayList<Inventory> getIList(){
        return this.iList;
    }
    public ArrayList<SalesTransaction> getSTXList(){
        return this.stxList;
    }
    
    
    boolean saveSupplierData(int id, String n, String co, Double cr) {
        //create Supplier object
       sObj = new Supplier(id, n, co, cr);
        
       //add Inventory object to Inventory list 
       return sList.add(sObj);  
    }

    void loadSuppliers() {
        sList.add(new Supplier(1,"Best Buy","1868-1111111",4000.0));
        sList.add(new Supplier(2,"Right Price","1868-2222222",5000.0));
        sList.add(new Supplier(3,"Top Quality","1868-3333333",3500.0));
    }

    
    
    void loadInventory() {
        iList.add(new Inventory(10001,"HD Power Drill","Tools",350.0,12,18,0));
        iList.add(new Inventory(10002,"HD Util Hammer","Tools",114.50,10,16,0));
        iList.add(new Inventory(10003,"PH Screwdriver","Tools",47.95,10,11,0));
        iList.add(new Inventory(10004,"FH Screwdriver","Tools",39.45,10,22,0));
        iList.add(new Inventory(20001,"Ft Step T/Can","Home-Jn",114.2,5,7,0));
        iList.add(new Inventory(20002,"Liq. Soap Disp","Home-Jn",48.50,10,13,0));
        iList.add(new Inventory(30001,"Press. Cooker","Kitchen",238.45,5,8,0));
        iList.add(new Inventory(30002,"Cop. 10 F/Pan","Kitchen",195.95,8,8,0));
        iList.add(new Inventory(30003,"Rm 6P-Fd Ctnr","Kitchen",94.85,12,14,0));
        iList.add(new Inventory(30004,"Brio 3Qt A/Fr","Kitchen",432.55,10,12,0));
    }//int id, String n, String de, String c, Double uc, int rl, int sl, Supplier sup, int q

    
    /*
    void loadEmployees() {
        eList.add(new Employee(1000,"Jack","Sparrow",Date(30,11,2004),"1868-7777777","Manager"));
        eList.add(new Employee(1001,"Davy","Jones",Date(14-03-2017),"1868-4444444","Sales Rep"));
        eList.add(new Employee(1002,"Hector","Barbosa",Date(28,08,2015),"1868-555555","Sale Rep"));
    }
    */


    void loadEmployees() {
        eList.add(new Employee("Jack","Sparrow","jack","november","Manager"));
        eList.add(new Employee("Hector","Barbosa","hector","december","Sales Rep"));
    }
    

    boolean saveTransactionData(int txID, ArrayList<Inventory> SalesItems, Double txTotal, Date salesDate) {
        //create salesTransaction object
       stxObj = new SalesTransaction(salesDate, txTotal);

       //add sales transaction object to saes transaction list 
       return stxList.add(stxObj); 
    }
    
    
    boolean saveInventoryData(int id, String n, String c, Double uc, int rl, int sl, int q) {
       //create Inventory object
       iObj = new Inventory(id, n, c, uc, rl, sl, q);
        
       //add Inventory object to Inventory list 
       return iList.add(iObj); 
    }


    /*
    public boolean saveInventoryData(int id, String n, String c, Double uc, int rl, int sl, Supplier sup, int q) {
        //create Inventory object
       iObj = new Inventory(id, n, c, uc, rl, sl, sup, q);
        
       //add Inventory object to Inventory list 
       return iList.add(iObj);  
               
    }//int, string, string, double, int, int, supplier, int
*/

    Employee Authenticate(String u, String p) {
        eObj = null;
        boolean found = false;
        
        for(int i=0; i<eList.size(); i++){
           //retrieve employee object 
           eObj = eList.get(i);
           
           if(eObj.getEUser().equals(u) && eObj.getEPass().equals(p)){
               found = true;
               break;
           }
           
        }//end for-loop
        
        if(!found) eObj = null;
        
        
        return eObj;
    
    }


    
}


