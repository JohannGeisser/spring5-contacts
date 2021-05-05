package johann.projects.spring5contacts.repositories;

import johann.projects.spring5contacts.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {



}
