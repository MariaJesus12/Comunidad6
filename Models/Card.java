package Models;

/**
 *
 * @author Álvaro Álvarez R
 */
public abstract class Card implements StatusControl {
    private String number;
    private boolean activate;

    public Card(String number) {
        this.number = number;
        this.activate = true;
    }

    public String getNumber() {
        return number;
    }

    public boolean isActivate() {
        return activate;
    }
    
    @Override
    public void activate(){
        this.activate = true;
    }
    @Override
    public void deactivate(){
        this.activate = false;
    }
    
}
