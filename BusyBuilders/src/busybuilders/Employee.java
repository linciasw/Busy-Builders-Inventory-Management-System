package busybuilders;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author botto
 */
public class Employee {
    
    //declare ID generator
    private static int idGen = 0;
   
    
    //declare instance variables
    private int empID;
    private String eFirstname;
    private String eLastname;
    private Date eHireDate;
    private String ePhone;
    //private String eEmail;
    private String eRole;
    private String eUser;
    private String ePass;
    
    
    
    //no-arg constructor methods
    public Employee(){
        idGen++;
        this.empID = idGen;
    }
    
    
    //Overloaded Employee Constructor - takes data entered on form in gui
    public Employee(int id, String f, String l, Date d, String p, String e, String r){
        idGen++;
        this.empID = idGen;
        this.eFirstname = f;
        this.eLastname = l;
        this.eHireDate = d;
        this.ePhone = p;
       // this.eEmail = e;
        this.eRole = r;      
    }
    
    
    //constructor to enable log in
    public Employee(String f, String l, String u, String p, String r){
        idGen++;
        this.empID = idGen;
        this.eFirstname = f;
        this.eLastname = l;
        this.eUser = u;
        this.ePass = p;
        this.eRole = r;      
    }
    
    //Accessor methods
    public int getEID(){ return this.empID; }
    public String getEFirstname(){ return this.eFirstname; }
    public String getELastname(){ return this.eLastname; }
    public Date getEHireDate(){ return this.eHireDate; }
    public String getEPhone(){ return this.ePhone; }
    //public String getEMail(){ return this.eEmail; }
    public String getERole(){ return this.eRole; }
    public String getEUser(){ return this.eUser; }
    public String getEPass(){ return this.ePass; }
    
    //Mutator Methods
    public void setEFirstname(String val){ this.eFirstname = val; }
    public void setELastname(String val){ this.eLastname= val; }
    public void setEHireDate(Date val){ this.eHireDate = val; }
    public void setEPhone(String val){ this.ePhone = val; }
   // public void setEMail(String val){ this.eEmail = val; }
    public void setERole(String val){ this.eRole = val; }
    public void setEUser(String val){ this.eUser = val; }
    public void setEPass(String val){ this.ePass = val; }
    
    
    //toString 
    public String toString(){
        return  this.empID +": Name -"+ 
                this.eFirstname 
                +" "+ this.eLastname.toUpperCase();
    }
    
}//end class Employee
