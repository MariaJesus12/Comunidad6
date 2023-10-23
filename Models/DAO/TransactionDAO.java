package Models.DAO;

import Models.DTO.AccountDTO;
import Models.DTO.TransactionDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class TransactionDAO implements Dao<TransactionDTO> {
    
    private HashMap<AccountDTO,TransactionDTO> hashmap;

    public TransactionDAO() {
        hashmap=new HashMap();
    }

    @Override
    public boolean add(TransactionDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getSource(), obj);
        return true;
    }


    public TransactionDTO read1(AccountDTO account) {
        return this.hashmap.get(account);
    }

    @Override
    public List<TransactionDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(TransactionDTO obj) {
         return this.add(obj);
    }

    @Override
    public boolean delete(TransactionDTO obj) {
         return hashmap.remove(obj.getSource())!=null;
    }

    @Override
    public TransactionDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
