package johann.projects.spring5contacts.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Organization extends Contact {

    private String address;

}
