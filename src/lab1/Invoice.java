

package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author neilkenney
 */
public class Invoice {
    
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;

    public Invoice(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    private Calendar getDueDate() {
        
        invoiceDate.add(Calendar.DATE, gracePeriod);
        dueDate = invoiceDate;
        return dueDate;
       
    }
    
    
    public final String getDueDateAsString(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date d = getDueDate().getTime();
        return sdf.format(d);
        
    }

    public final Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public final int getGracePeriod() {
        return gracePeriod;
    }

    public final void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }
    
    
    
    

}
