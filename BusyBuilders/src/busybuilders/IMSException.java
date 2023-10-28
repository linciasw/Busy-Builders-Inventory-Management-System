package busybuilders;

/**
 *
 * @author sheenasylvester
 */
public class IMSException extends Exception{
    
    String message = null;
    
    public IMSException(String msg){
        this.message = msg;
    }
    
    public String getMessage(){
        return this.message;
    }
    
}