package lab4;

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
    
    
    public Date createDateObject(String s)throws FormatException{
        
        String[] str = s.split("/");
        
        if(s.length() < 8 || s.length() > 10){
             throw new FormatException("Date string must be between 8 and 10 characters");
        }
        else{
            
            if(str.length != 3){
                throw new FormatException("Date format must include 2 / ");
            }
            else{
                for(int x = 0; x < str.length; x++){
                    char[] characters = str[x].toCharArray();
                    for(char y : characters){
                        
                        if(!Character.isDigit(y)){
                            throw new FormatException("Date format must be numeric");
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
    
    public Calendar createCalendarObject(String d)throws FormatException{
        Date b = null;
        String[] str = d.split(" ");
        if(str.length != 5){
            throw new FormatException();
        }
        for(int y = 0;y < str.length; y++){
            char[] characters = str[y].toCharArray();
            if(y == 0){
                for(char t : characters){
                    if(!Character.isAlphabetic(t)){
                        throw new FormatException("Month must be in Alphabetic form");
                    }
                }
            }
            if(y == 1){
                for(char t : characters){
                    
                    if(characters.length < 2 || characters.length > 3){
                        throw new FormatException();
                    }
                    
                }
            }
            if(y == 2){
                for(char t : characters){
                    if(characters.length < 2 || characters.length > 4){
                        throw new FormatException("Year must be 2 or 4 digits");
                    }
                    if(!Character.isDigit(t)){
                        throw new FormatException("Year must be numeric");
                    }
                }
            }
            if(y == 3){
                for(char t : characters){
                    if(characters.length < 4 || characters.length > 5){
                        throw new FormatException("Time must be in hh:mm format");
                    }
                    String[] s = str[y].split(":");
                    if(s.length != 2){
                        throw new FormatException("Time must contain :");
                    }
                }
            }
        }
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
