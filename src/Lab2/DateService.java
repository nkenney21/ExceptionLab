

package Lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author neilkenney
 */
public class DateService {
    
    private Date a;
    private Calendar c = Calendar.getInstance();
    
    
    public final Date createDateObject(String s){
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try
        {
        a = sdf.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(DateService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
        
        
    }
    
    public final Calendar createCalendarObject(String d){
        Date b = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMMMMMMM dd, yyyy hh:mm aa");
        try
        {
        b = sdf.parse(d);
        }
        catch (ParseException ex) {
            Logger.getLogger(DateService.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(b);
                
        return c;
                
    }

    public final Date getA() {
        return a;
    }

    public final void setA(Date a) {
        this.a = a;
    }

    public final Calendar getC() {
        return c;
    }

    public final void setC(Calendar c) {
        this.c = c;
    }

    
    

}
