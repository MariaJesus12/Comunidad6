package Models.DAO;

import Models.DTO.PersonDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class PersonDAO implements Dao<PersonDTO> {
    private HashMap<String,PersonDTO> hashmap;

    public PersonDAO() {
        hashmap = new HashMap();
    }
    
    @Override
    public boolean add(PersonDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getId(), obj);
        return true;
    }

    public PersonDTO read1(String id) {
         return this.hashmap.get(id);
    }

    @Override
    public List<PersonDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(PersonDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(PersonDTO obj) {
        return hashmap.remove(obj.getId())!=null;
    }

    @Override
    public PersonDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
