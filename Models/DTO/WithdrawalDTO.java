package Models.DTO;

import Models.*;
import java.sql.Date;

/**
 *
 * @author Álvaro Álvarez R
 */
public class WithdrawalDTO extends TransactionDTO{

    public WithdrawalDTO(double amount, AccountDTO source, Date date) {
        super(amount, source, date);
    }

}
