import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PersonDAO {

    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();

    public void createPersons(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (person != null) {
            em.persist(person);
            System.out.println("You have successfully added: \n" + person.toString());
        } else {
            System.out.println("An error has occured. No object was added to the DB.");
        }
        em.getTransaction().commit();
        em.close();
    }

    public Person findById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //em.find - We're searching in the class, Person, and want to find the ID attribute
        Person foundPerson = em.find(Person.class, id);
        if (foundPerson == null) {
            System.out.println("The ID you provided does not exist");
        }
        em.close();
        return foundPerson;
    }

    public void deletePerson(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person personToDelete = em.find(Person.class, id);
        if (personToDelete != null) {
            System.out.println("Person with following information will now be deleted \n" + personToDelete.toString());
            em.remove(personToDelete);
        } else {
            System.out.println("An error has occured - No person was deleted");
        }
        em.getTransaction().commit();
        em.close();
    }

    public void getAllPersons() {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("SELECT p FROM Person p", Person.class).getResultList().forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
    }

    public void getInformationByPhoneNumber(int phoneNumber) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("SELECT p FROM Person p WHERE p.phoneNumber = :phoneNumber", Person.class).setParameter("phoneNumber", phoneNumber).getResultList().forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
    }

    public Person findByZip(CityInfo zip) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person foundZip = em.find(Person.class, zip);
        if (foundZip == null) {
            System.out.println("No person found with the provided zip: " + zip);
        }
        em.close();
        return foundZip;
    }


    public List<Person> getPersonInACity(String city) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p WHERE LOWER (p.address.city) = LOWER(:city)", Person.class);
        query.setParameter("city", city);
        em.getTransaction().commit();
        em.close();
        return query.getResultList();
    }

    public List<Person> getPersonByZip(String zip) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p WHERE LOWER (p.zip) = LOWER(:zip)", Person.class);
        query.setParameter("city", zip);
        em.getTransaction().commit();
        em.close();
        return query.getResultList();
    }
}
