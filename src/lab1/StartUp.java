
package lab1;

import java.util.Calendar;

public class StartUp {

    public static void main(String[] args) {
        
        Invoice i = new Invoice(Calendar.getInstance());
        
        System.out.println(i.getDueDateAsString());
    }
    
}
