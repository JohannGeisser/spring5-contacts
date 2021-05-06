package johann.projects.spring5contacts.controllers;

import johann.projects.spring5contacts.repositories.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping({"/person", "/person.html"})
    public String getPersons(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "persons/list";
    }

}
