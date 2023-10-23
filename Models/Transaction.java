package Models;

import java.sql.Date;
/**
 *
 * @author Álvaro Álvarez R
 */
public abstract class Transaction {
    private double amount;
    private Account source;
    private Date date;

    public Transaction(double amount, Account source, Date date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public Account getSource() {
        return source;
    }

    public Date getDate() {
        return date;
    }
    
    public boolean execute1(){
        return this.source.deposit(amount);
    }
    public boolean execute2(){
        return this.source.withdraw(amount);
    }
    public boolean execute3(){
        return this.source.transfer(source, amount);
    }
    
}
