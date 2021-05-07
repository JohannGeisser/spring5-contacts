package johann.projects.spring5contacts.services;

import johann.projects.spring5contacts.model.Person;

public interface ContactService<T> {

    T findById(Long id);

}
