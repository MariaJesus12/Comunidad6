package Models.DAO;

import Models.DTO.CustomerDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class CustomerDAO implements Dao<CustomerDTO>{
    private HashMap<String,CustomerDTO> hashmap;

    public CustomerDAO() {
        hashmap = new HashMap();
    }

    @Override
    public boolean add(CustomerDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getId(), obj);
        return true;
    }

    @Override
    public CustomerDTO read(String id) {
        return hashmap.get(id);
    }

    @Override
    public List<CustomerDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(CustomerDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(CustomerDTO obj) {
        return hashmap.remove(obj.getId())!=null;
    }
    
    
}
