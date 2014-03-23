

package lab4;

/**
 *
 * @author neilkenney
 */
public class FormatException extends Exception{
    
    public FormatException(){
        
        super("Format is not correct");
    }
    
    public FormatException(String str){
        
        super( str );
    }

}
