/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Controller.Controller;
import Controller.UserController;
import Models.DAO.Dao;
import Models.DAO.UserDAOList;
import Models.User;
import View.UserFRMView;
import View.View;

/**
 *
 * @author Álvaro Álvarez R
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dao userDao = UserDAOList.getIntance();
        
        UserFRMView userView = new UserFRMView();
        userView.setVisible(true);
        
        Controller userController = new UserController(userView,userDao);
        
        User user1 = new User("1","Juan","JJ","123");
        User user2 = new User("2","Felipe","FF","321");
        User user3 = new User("1","Maria","MM","la456");
        
        userController.add(user1);
        userController.add(user2);
        userController.add(user3);
        
        userController.read("3");
    }
    
}
