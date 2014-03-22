
package Lab2;

public class StartUp {

    public static void main(String[] args) {
        
        DateService a = new DateService();
        
        a.createDateObject("3/15/2014");
        System.out.println(a.getA());
        
        a.createCalendarObject("March 15, 2014 2:30 PM");
        System.out.println(a.getC());
    }
    
}
