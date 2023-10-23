package Models.DTO;
/**
 *
 * @author Álvaro Álvarez R
 */
public class DebitCardDTO extends CardDTO{
    private AccountDTO account;

    public DebitCardDTO(AccountDTO account, String number) {
        super(number);
        this.account = account;
    }

    public AccountDTO getAccount() {
        return account;
    }

}
