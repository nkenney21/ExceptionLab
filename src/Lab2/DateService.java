

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
    
    
    public Date createDateObject(String s){
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try
        {
        a = sdf.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(DateService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
        
        
    }
    
    public Calendar createCalendarObject(String d){
        Date b;
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMMMMMMM dd, yyyy hh:mm aa");
        try
        {
        b = sdf.parse(d);
        }
        catch (ParseException ex) {
            Logger.getLogger(DateService.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setTime(a);
                
        return c;
                
    }

    public Date getA() {
        return a;
    }

    public void setA(Date a) {
        this.a = a;
    }

    public Calendar getC() {
        return c;
    }

    public void setC(Calendar c) {
        this.c = c;
    }

    
    

}
