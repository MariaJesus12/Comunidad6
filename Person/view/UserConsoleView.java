/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.view;

import Models.User;
import View.View;

/**
 *
 * @author Álvaro Álvarez R
 */
public class UserConsoleView implements View<User>{

    @Override
    public void display(User obj) {
        System.out.println("Id: "+obj.getId());
        System.out.println("Nombre: "+obj.getName());
        System.out.println("Nombre de usuario: "+obj.getUserName());
    }

    @Override
    public void displayMessage(String msj) {
        System.out.println(msj);
    }
   
}
