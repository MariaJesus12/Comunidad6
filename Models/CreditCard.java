package Models;

/**
 *
 * @author Álvaro Álvarez R
 */
public class CreditCard extends Card{
    private double balance;
    private double creditLimit;
    private double interestRate;

    public CreditCard(double balance, double creditLimit, double interestRate, String number) {
        super(number);
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }
    
    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    public boolean makePyment(double amount){
        if (amount > 0 && this.balance > 0){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean makePurchase(double amount){
        if (amount > 0 && this.balance+amount <= this.creditLimit){
            this.balance+=amount;
            return true;
        }else{
            return false;
        }
    }
}
