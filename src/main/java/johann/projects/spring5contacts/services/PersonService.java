package johann.projects.spring5contacts.services;

import johann.projects.spring5contacts.model.Contact;
import johann.projects.spring5contacts.model.Person;
import johann.projects.spring5contacts.repositories.ContactRepository;
import johann.projects.spring5contacts.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService implements ContactService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person findById(Long id) {
        Optional<Person> personOptional = personRepository.findById(id);

        if (!personOptional.isPresent()) {
            throw new RuntimeException("Person not found!");
        }

        return personOptional.get();
    }
}
