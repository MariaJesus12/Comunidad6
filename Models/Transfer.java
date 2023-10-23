package Models;

import java.sql.Date;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Transfer extends Transaction{

    public Transfer(double amount, Account source, Date date) {
        super(amount, source, date);
    }
    
    public boolean execute(){
        return super.execute3();
    }
}
