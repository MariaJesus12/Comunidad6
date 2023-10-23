package Models.DAO;

import Models.DTO.UserDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class UserDAOList implements Dao<UserDTO>{
    
    private static UserDAOList instance;
    private HashMap<String, UserDTO> userList;

    private UserDAOList() {
        userList = new HashMap();
    }
    
    @Override
    public boolean add(UserDTO obj) {
        if (obj==null) return false;
        userList.put(obj.getId(), obj);
        return true;
    }

    @Override
    public UserDTO read(String id) {
        return this.userList.get(id);
    }

    @Override
    public List<UserDTO> readAll() {
        return new ArrayList<>(userList.values());
    }

    @Override
    public boolean update(UserDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(UserDTO obj) {
        return userList.remove(obj.getId())!=null;
    }
    
    public static UserDAOList getIntance(){
        if (instance==null){
            instance=new UserDAOList();
        }
        return instance;
    }
}
