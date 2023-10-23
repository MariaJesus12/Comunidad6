package Models.DTO;

import java.sql.Date;
import java.time.Period;
/**
 *
 * @author Álvaro Álvarez R
 */
public class CustomerDTO extends PersonDTO{
    private Date dateOfBirth;
    private String phone;
    private String email;
    private String addres;
    
    public CustomerDTO(String id, String name, Date dateOfBirth, String phone, String email, String addres) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.addres = addres;
    }

    public CustomerDTO(String id, String name, Date dateOfBirth, String email, String addres) {
        super(id, name);
        this.dateOfBirth = dateOfBirth;
        this.phone = "";    
        this.email = email;
        this.addres = addres;
    }

    public int getAge() {
        return this.calculateAge();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    
    private int calculateAge(){
        return Period.between(this.dateOfBirth.toLocalDate(), new Date(System.currentTimeMillis()).toLocalDate()).getYears();
    }
    
}
