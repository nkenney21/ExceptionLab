package lab4;


public class StartUp {
    public static void main(String[] args) {
        
        DateService a = new DateService();
        
        try{
        a.createDateObject("01/15/2014");
        }
        catch(FormatException ex){
            System.out.println(ex.getMessage());
            
        }
        System.out.println(a.getA());
        
        try{
        a.createCalendarObject("Marc h 15, 2014 1230 PM");
        }catch(FormatException exc){
            System.out.println(exc.getMessage());
        }
        System.out.println(a.getC());
        
    }

}
