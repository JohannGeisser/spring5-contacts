package johann.projects.spring5contacts.services;

import johann.projects.spring5contacts.model.Organization;
import johann.projects.spring5contacts.model.Person;

public interface ContactService {

    Organization findById(Long id);

}
