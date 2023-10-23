package Models.DTO;

import java.sql.Date;
/**
 *
 * @author Álvaro Álvarez R
 */
public class DepositDTO extends TransactionDTO{

    public DepositDTO(double amount, AccountDTO source, Date date) {
        super(amount, source, date);
    }
    
}
