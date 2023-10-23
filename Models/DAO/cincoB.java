 package Models.DAO;

import java.util.ArrayList;

public class cincoB {
    private Dao dao;
    private ArrayList<Dao> array;
    private Dao statico;

    public cincoB() {
        array=new ArrayList();
        this.statico=this.primerP();
    }

    public Dao getDao() {
        return dao;
    }
    
    public Dao primerP(){
        return array.get(0);
    }
    
    public Dao siguiente(Dao statico){
        int num=0;
        for (Dao dao : array){
            if (dao==statico){
                num=array.indexOf(dao);
            }
        }
        this.statico= array.get(num+1);
        return array.get(num+1);
        
    }
    
    public Dao anterior(Dao statico){
        int num=0;
        for (Dao dao : array){
            if (dao==statico){
                num=array.indexOf(dao);
            }
        }
        this.statico= array.get(num-1);
        return array.get(num-1);
    }
    
    public Dao ultimo(){
        int num = array.size();
        return array.get(num);
    }
    
    
    
}
