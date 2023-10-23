package Models;

import java.sql.Date;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Deposit extends Transaction{

    public Deposit(double amount, Account source, Date date) {
        super(amount, source, date);
    }
    
    
    public boolean execute(){
        return super.execute1();
    }
}
