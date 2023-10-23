package Controller;

import Models.DAO.Dao;
import Models.DTO.UserDTO;
import Models.User;
import View.View;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class UserController implements Controller<User>{
    private View view;
    private Dao dao;

    public UserController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    @Override
    public boolean add(User obj) {
        if (dao.read(obj.getId())!=null){
            view.displayMessage("Usuario ya existente, no se agregó");
            return false;
        }else{
            //Validar información
            UserDTO userDTO = new UserDTO(obj.getId(),obj.getName(),obj.getUserName(),obj.getPassword());
            if (dao.add(userDTO)){            view.displayMessage("Usuario gregado correctamente");
                return true;
            }else{
                view.displayMessage("Error al agregar el usuario");
                return false;
            }

        }
        
    }

    @Override
    public User read(String id) {
        UserDTO userDTO = (UserDTO) dao.read(id);
        if (userDTO==null){
            view.displayMessage("Usuario no encontrado");
            return null;
        }else{
            User user = new User(userDTO.getId(),userDTO.getName(),userDTO.getUserName(),userDTO.getPassword());
            view.display(user);
            return user;
        }
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public boolean update(User obj) {
        return false;
    }

    @Override
    public boolean delete(User obj) {
        return false;
    }
    
}
