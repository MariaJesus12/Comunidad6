package Models.DAO;

import Models.DTO.ColonAccountDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class ColonAccountDAO implements Dao<ColonAccountDTO> {
private HashMap<String,ColonAccountDTO> hashmap;

    public ColonAccountDAO() {
        hashmap = new HashMap();
    }

    @Override
    public boolean add(ColonAccountDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getNumber(), obj);
        return true;
    }

    public ColonAccountDTO read1(String number) {
         return this.hashmap.get(number);
    }

    @Override
    public List<ColonAccountDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(ColonAccountDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(ColonAccountDTO obj) {
        return hashmap.remove(obj.getNumber())!=null;
    }

    @Override
    public ColonAccountDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
