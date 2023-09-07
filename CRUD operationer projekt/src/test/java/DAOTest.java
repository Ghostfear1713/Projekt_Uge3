import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DAOTest {

    EntityManagerFactory emf;

    PersonDAO personDAO = new PersonDAO();
    HobbyDAO hobbyDAO = new HobbyDAO();
    PhoneNumberDAO phoneNumberDAO = new PhoneNumberDAO();

    @BeforeEach
    void setUp() {
        emf = HibernateConfig.getEntityManagerFactoryConfig();
    }

    @Test
    void createPersons() {
    }
    @Test
    void updatePerson(){
        Person person = personDAO.findById(1);
        person.setFirstName("Orhan");
        personDAO.updatePerson(person);

        Person personAfter = personDAO.findById(1);
        System.out.println(personAfter);
        assertEquals(person.getFirstName(), personAfter.getFirstName());
        //AssertEquals bruger vi altid! Venstre side er vores forventet og højre er den det burde være
    }

    @Test
    void findById() {

    }

    @Test
    void deletePerson() {
    Person person = personDAO.findById(3);
    personDAO.deletePerson(3);
    //Checks if the person with ID 3 no longer exists in the DB
    assertNull(personDAO.findById(3));
    }

    @Test
    void getAllPersons() {
        //We make a list of persons
    List<Person> listOfPersons = personDAO.getAllPersons();
    //Checks if the provided list is not null - If the list is null, the assertion fails
    assertNotNull(listOfPersons);
    //If it returns something it will have the value true
    assertTrue(listOfPersons.size()>0);
    }




}