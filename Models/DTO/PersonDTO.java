package Models.DTO;

/**
 *
 * @author Álvaro Álvarez R
 */
public class PersonDTO {
    private String id;
    private String name;

    public PersonDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}

