package Models.DAO;

import Models.DTO.DollarAccountDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class DollarAccountDAO implements Dao<DollarAccountDTO> {
    
    private HashMap<String,DollarAccountDTO> hashmap;

    public DollarAccountDAO() {
        hashmap = new HashMap();
    }

        @Override
    public boolean add(DollarAccountDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getNumber(), obj);
        return true;
    }

    public DollarAccountDTO read1(String number) {
         return this.hashmap.get(number);
    }

    @Override
    public List<DollarAccountDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(DollarAccountDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(DollarAccountDTO obj) {
        return hashmap.remove(obj.getNumber())!=null;
    }

    @Override
    public DollarAccountDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
