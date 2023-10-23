package Models.DAO;

import Models.DTO.CreditCardDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class CreditCardDAO implements Dao<CreditCardDTO>{
    private HashMap<String,CreditCardDTO> hashmap;

    public CreditCardDAO() {
        hashmap = new HashMap();
    }

    @Override
    public boolean add(CreditCardDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getNumber(), obj);
        return true;
    }

    public CreditCardDTO read1(String number) {
         return this.hashmap.get(number);
    }

    @Override
    public List<CreditCardDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(CreditCardDTO obj) {
        return this.add(obj);
    }

    @Override
    public boolean delete(CreditCardDTO obj) {
        return hashmap.remove(obj.getNumber())!=null;
    }

    @Override
    public CreditCardDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
