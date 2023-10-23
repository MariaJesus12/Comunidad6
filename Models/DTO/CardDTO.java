package Models.DTO;
/**
 *
 * @author Álvaro Álvarez R
 */
public abstract class CardDTO{
    private String number;
    private boolean activate;

    public CardDTO(String number) {
        this.number = number;
        this.activate = true;
    }

    public String getNumber() {
        return number;
    }

    public boolean isActivate() {
        return activate;
    }
    
}
