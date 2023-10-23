package Models.DTO;

import java.sql.Date;
/**
 *
 * @author Álvaro Álvarez R
 */
public class TransferDTO extends TransactionDTO{

    public TransferDTO(double amount, AccountDTO source, Date date) {
        super(amount, source, date);
    }
    
}
