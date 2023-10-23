package Models.DAO;

import Models.DTO.AccountDTO;
import Models.DTO.WithdrawalDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Álvaro Álvarez R
 */
public class WithdrawalDAO implements Dao<WithdrawalDTO> {
    private HashMap<AccountDTO,WithdrawalDTO> hashmap;

    public WithdrawalDAO() {
        hashmap = new HashMap();
    }
    
    @Override
    public boolean add(WithdrawalDTO obj) {
        if (obj==null) return false;
        hashmap.put(obj.getSource(), obj);
        return true;
    }

    public WithdrawalDTO read1(AccountDTO account) {
        return this.hashmap.get(account);
    }

    @Override
    public List<WithdrawalDTO> readAll() {
        return new ArrayList<>(hashmap.values());
    }

    @Override
    public boolean update(WithdrawalDTO obj) {
         return this.add(obj);
    }

    @Override
    public boolean delete(WithdrawalDTO obj) {
         return hashmap.remove(obj.getSource())!=null;
    }

    @Override
    public WithdrawalDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
