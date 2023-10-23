package Models.DAO;

import Models.DTO.DebitCardDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class DebitCardDAO implements Dao<DebitCardDTO> {
private HashMap<String,DebitCardDTO> hashmap;

    public DebitCardDAO() {
        hashmap = new HashMap();
    }

    @Override
    public boolean add(DebitCardDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getNumber(), obj);
        return true;
    }

    public DebitCardDTO read1(String number) {
         return this.hashmap.get(number);
    }

    @Override
    public List<DebitCardDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(DebitCardDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(DebitCardDTO obj) {
        return hashmap.remove(obj.getNumber())!=null;
    }

    @Override
    public DebitCardDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}

