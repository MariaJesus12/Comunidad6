package Models.DAO;

import Models.DTO.AccountDTO;
import Models.DTO.DepositDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class DepositDAO implements Dao<DepositDTO> {
    private HashMap<AccountDTO,DepositDTO> hashmap;

    public DepositDAO() {
        hashmap = new HashMap();
    }
    
    @Override
    public boolean add(DepositDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getSource(), obj);
        return true;
    }


    public DepositDTO read1(DepositDTO account) {
        return this.hashmap.get(account);
    }

    @Override
    public List<DepositDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(DepositDTO obj) {
         return this.add(obj);
    }

    @Override
    public boolean delete(DepositDTO obj) {
         return hashmap.remove(obj.getSource())!=null;
    }

    @Override
    public DepositDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
}
