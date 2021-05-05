package johann.projects.spring5contacts.model;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String number;

}
