package Models;

/**
 *
 * @author Álvaro Álvarez R
 */
public class User extends Person{
    private String userName;
    private int password;

    public User(String id, String name, String userName, String password) {
        super(id, name);
        this.userName = userName;
        this.setPassword(password);
    }
    public User(String id, String name, String userName, int password) {
        super(id, name);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public int getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = this.encryp(password);
    }
    
    private int encryp(String password){
        return password.hashCode();
        
    }
}
