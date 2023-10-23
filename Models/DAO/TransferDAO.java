package Models.DAO;

import Models.DTO.AccountDTO;
import Models.DTO.TransferDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class TransferDAO implements Dao<TransferDTO> {
    private HashMap<AccountDTO,TransferDTO> hashmap;

    public TransferDAO() {
        hashmap = new HashMap();
    }
    
    @Override
    public boolean add(TransferDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getSource(), obj);
        return true;
    }

    public TransferDTO read1(AccountDTO account) {
        return this.hashmap.get(account);
    }

    @Override
    public List<TransferDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(TransferDTO obj) {
         return this.add(obj);
    }

    @Override
    public boolean delete(TransferDTO obj) {
         return hashmap.remove(obj.getSource())!=null;
    }

    @Override
    public TransferDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}

