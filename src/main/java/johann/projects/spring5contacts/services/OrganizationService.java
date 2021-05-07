package johann.projects.spring5contacts.services;

import johann.projects.spring5contacts.model.Organization;
import johann.projects.spring5contacts.repositories.OrganizationRepository;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class OrganizationService implements ContactService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization findById(Long id) {
        Optional<Organization> organizationOptional = organizationRepository.findById(id);

        if (!organizationOptional.isPresent()) {
            throw new RuntimeException("Organization not found!");
        }

        return organizationOptional.get();
    }


}
