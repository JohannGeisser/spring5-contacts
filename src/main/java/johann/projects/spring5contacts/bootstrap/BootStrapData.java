package johann.projects.spring5contacts.bootstrap;

import johann.projects.spring5contacts.model.Contact;
import johann.projects.spring5contacts.model.Organization;
import johann.projects.spring5contacts.model.Person;
import johann.projects.spring5contacts.repositories.OrganizationRepository;
import johann.projects.spring5contacts.repositories.PersonRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Scanner;

@Component
public class BootStrapData implements CommandLineRunner {

    private final OrganizationRepository organizationRepository;
    private final PersonRepository personRepository;

    public BootStrapData(OrganizationRepository organizationRepository, PersonRepository personRepository) {
        this.organizationRepository = organizationRepository;
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Started in Bootstrap");

        // --------------- Person ---------------

        Person person = new Person();
        person.setName("Johann");
        person.setSurname("Geisser");
        person.setBirthday("September");
        person.setGender("M");
        person.setNumber("75816516");

        personRepository.save(person);

        Person person2 = new Person();
        person2.setName("Josue");
        person2.setSurname("Geisser");
        person2.setBirthday("January");
        person2.setGender("M");
        person2.setNumber("75816474");

        personRepository.save(person2);

        System.out.println("Added Person Contact");

        // --------------- Organization ---------------

        Organization organization = new Organization();

        organization.setName("Pepez");
        organization.setAddress("Alto Irpavi");
        organization.setNumber("22720908");

        organizationRepository.save(organization);

        System.out.println("Added Organization Contact");

    }
}
