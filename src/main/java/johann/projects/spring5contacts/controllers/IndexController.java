package johann.projects.spring5contacts.controllers;

import johann.projects.spring5contacts.model.Contact;
import johann.projects.spring5contacts.repositories.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final ContactRepository contactRepository;

    public IndexController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String showIndex(Model model) {

        model.addAttribute("contacts", contactRepository.findAll());

        return "index";

    }

}
