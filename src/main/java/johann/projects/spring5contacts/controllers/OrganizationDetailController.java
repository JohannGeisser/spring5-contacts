package johann.projects.spring5contacts.controllers;

import johann.projects.spring5contacts.services.OrganizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrganizationDetailController {

    private final OrganizationService organizationService;

    public OrganizationDetailController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @RequestMapping("/organizations/details{id}")
    public String findById(@PathVariable String id, Model model) {

        model.addAttribute("organizationDetail", organizationService.findById(new Long(id)));

        return "organizations/details";

    }

}
