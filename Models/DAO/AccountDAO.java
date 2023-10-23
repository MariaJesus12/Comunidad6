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
public class AccountDAO implements Dao<AccountDTO>{
    private ArrayList<AccountDTO> array;
    private AccountDTO statico;
    private AccountDTO DTO;

    public AccountDAO() {
        array = new ArrayList();
        statico=this.primerP();
    }

    @Override
    public boolean add(AccountDTO obj) {
        if (obj==null) return false;
        array.add(obj);
        return true;
    }

    public AccountDTO read1(AccountDTO account) {
         for (AccountDTO account1: array){
             if(account1==account){
                 return account;
             }
         }
         return null;
    }

    @Override
    public List<AccountDTO> readAll() {
        return new ArrayList<>(array);
    }

    @Override
    public boolean update(AccountDTO obj) {
        return array.add(obj);
    }

    @Override
    public boolean delete(AccountDTO obj) {
        return array.remove(obj);
    }

    @Override
    public AccountDTO read(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AccountDTO getDao() {
        return DTO;
    }
    
    public AccountDTO primerP(){
        return array.get(0);
    }
    
    public AccountDTO siguiente(Dao statico){
        int num=0;
        for (AccountDTO dto : array){
            if (dto==statico){
                num=array.indexOf(dto);
            }
        }
        this.statico= array.get(num+1);
        return array.get(num+1);
        
    }
    
    public AccountDTO anterior(Dao statico){
        int num=0;
        for (AccountDTO dto : array){
            if (dto==statico){
                num=array.indexOf(dto);
            }
        }
        this.statico= array.get(num-1);
        return array.get(num-1);
    }
    
    public AccountDTO ultimo(){
        int num = array.size();
        return array.get(num);
    }
    
}
