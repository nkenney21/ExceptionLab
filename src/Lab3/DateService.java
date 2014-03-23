

package Lab3;

import Lab2.*;
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
    
    
    public Date createDateObject(String s)throws IllegalArgumentException{
        
        String[] str = s.split("/");
        
        if(s.length() < 8 || s.length() > 10){
             throw new IllegalArgumentException("Date string must be between 8 and 10 characters");
        }
        else{
            
            if(str.length != 3){
                throw new IllegalArgumentException("Date format must include 2 / ");
            }
            else{
                for(int x = 0; x < str.length; x++){
                    char[] characters = str[x].toCharArray();
                    for(char y : characters){
                        
                        if(!Character.isDigit(y)){
                            throw new IllegalArgumentException("Date format must be numeric");
                        }
                        
                    }
                }
                
            }
        
        }
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
