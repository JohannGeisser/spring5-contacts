package johann.projects.spring5contacts.controllers;

import johann.projects.spring5contacts.repositories.PersonRepository;
import johann.projects.spring5contacts.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonDetailController {

    private final PersonService personService;

    public PersonDetailController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/persons/details{id}")
    public String getPersonDetail(@PathVariable String id, Model model) {
        model.addAttribute("personDetail", personService.findById(new Long(id)));
        return "persons/details";
    }

}
