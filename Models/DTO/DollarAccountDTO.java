package Models.DTO;

import Models.*;

/**
 *
 * @author Student
 */
public class DollarAccountDTO extends AccountDTO{
    private double exchangeRate;

    public DollarAccountDTO(double exchangeRate, String number, double balance, CustomerDTO customer, boolean activate) {
        super(number, balance, customer, activate);
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

}
