package Models.DAO;

import Models.DTO.CardDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class CardDAO implements Dao<CardDTO>{
    private HashMap<String,CardDTO> hashmap;

    public CardDAO() {
        hashmap = new HashMap();
    }

    
    @Override
    public boolean add(CardDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getNumber(), obj);
        return true;
    }

    public CardDTO read1(String number) {
         return this.hashmap.get(number);
    }

    @Override
    public List<CardDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(CardDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(CardDTO obj) {
        return hashmap.remove(obj.getNumber())!=null;
    }

    @Override
    public CardDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}