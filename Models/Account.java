/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Student
 */
public abstract class Account implements StatusControl {
    private String number;
    private double balance;
    private Customer customer;
    private boolean active;

    public Account(String number, double balance, Customer customer) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active=true;
    }
    
    public Account(String number, Customer customer) {
        this.number = number;
        this.balance = 0;
        this.customer = customer;
        this.active=true;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public boolean isActive() {
        return active;
    }
    

    
    @Override
    public void activate() {
       this.active=true;
    }

    @Override
    public void deactivate() {
        this.active=false;
    }
    
    public boolean deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfer(Account destination, double amount){
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            destination.deposit(amount);
            return true;
        } else {
            return false;
        }
    }
    
}
