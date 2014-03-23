

package lab4;

import Lab3.*;

public class StartUp {
    public static void main(String[] args) {
        
        DateService a = new DateService();
        
        try{
        a.createDateObject("Ja/15/2014");
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            
        }
        System.out.println(a.getA());
        
        try{
        a.createCalendarObject("March 15, 2014 1230 PM");
        }catch(IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
        System.out.println(a.getC());
        
    }

}
