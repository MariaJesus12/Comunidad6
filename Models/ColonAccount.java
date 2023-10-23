/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Student
 */
public class ColonAccount extends Account {

    public ColonAccount(String number, double balance, Customer customer) {
        super(number, balance, customer);
    }

    public ColonAccount(String number, Customer customer) {
        super(number, customer);
    }
    
    @Override
     public boolean transfer(Account destination, double amount){
        return super.transfer(destination, amount);
    }
    
}
