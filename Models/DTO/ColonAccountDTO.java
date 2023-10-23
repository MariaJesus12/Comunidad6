package Models.DTO;
/**
 *
 * @author Student
 */
public class ColonAccountDTO extends AccountDTO {

    public ColonAccountDTO(String number, double balance, CustomerDTO customer, boolean activate) {
        super(number, balance, customer,activate);
    }
    
}
