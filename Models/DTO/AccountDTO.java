/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DTO;

/**
 *
 * @author Student
 */
public abstract class AccountDTO {
    private String number;
    private double balance;
    private CustomerDTO customer;
    private boolean active;

    public AccountDTO(String number, double balance, CustomerDTO customer, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active=active;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    public CustomerDTO getCustomer() {
        return customer;
    }
     
}
