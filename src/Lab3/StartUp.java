

package Lab3;

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
        
        a.createCalendarObject("March 15, 2014 2:30 PM");
        System.out.println(a.getC());
        
    }

}
