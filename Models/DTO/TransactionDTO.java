package Models.DTO;

import java.sql.Date;
/**
 *
 * @author Álvaro Álvarez R
 */
public abstract class TransactionDTO {
    private double amount;
    private AccountDTO source;
    private Date date;

    public TransactionDTO(double amount, AccountDTO source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public AccountDTO getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }
    
    
}
