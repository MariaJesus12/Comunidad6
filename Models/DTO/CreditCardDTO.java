package Models.DTO;
/**
 *
 * @author Álvaro Álvarez R
 */
public class CreditCardDTO extends CardDTO{
    private double balance;
    private double creditLimit;
    private double interestRate;

    public CreditCardDTO(double balance, double creditLimit, double interestRate, String number) {
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

}
