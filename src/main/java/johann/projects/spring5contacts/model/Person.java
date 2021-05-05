package johann.projects.spring5contacts.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Person extends Contact{

    private String surname;
    private String birthday;
    private String gender;

}
