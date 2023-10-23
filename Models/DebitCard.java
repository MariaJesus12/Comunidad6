package Models;

/**
 *
 * @author Álvaro Álvarez R
 */
public class DebitCard extends Card{
    private Account account;

    public DebitCard(Account account, String number) {
        super(number);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
    
    public boolean makePurchase(double amount){
        return account.withdraw(amount);
    }
}
