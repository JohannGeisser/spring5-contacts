package johann.projects.spring5contacts.repositories;

import johann.projects.spring5contacts.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {



}
