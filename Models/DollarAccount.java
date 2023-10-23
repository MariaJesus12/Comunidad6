package Models;
/**
 *
 * @author Student
 */
public class DollarAccount extends Account{
    private double exchangeRate;

    public DollarAccount(double exchangeRate, String number, double balance, Customer customer) {
        super(number, balance, customer);
        this.exchangeRate = exchangeRate;
    }

    public DollarAccount(double exchangeRate, String number, Customer customer) {
        super(number, customer);
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    
    
    @Override
     public boolean transfer(Account destination, double amount){
        return super.transfer(destination, amount);
    }
}
