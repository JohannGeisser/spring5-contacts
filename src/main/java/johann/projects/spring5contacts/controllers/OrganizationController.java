package johann.projects.spring5contacts.controllers;

import johann.projects.spring5contacts.repositories.OrganizationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrganizationController {

    private final OrganizationRepository organizationRepository;

    public OrganizationController(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @RequestMapping({"/organizations", "/organizations.html"})
    public String getOrganizations(Model model) {
        model.addAttribute("organizations", organizationRepository.findAll());
        return "organizations/list";
    }

}
