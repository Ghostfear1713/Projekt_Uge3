import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class HobbyDAO {

    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();

    //find how many there are on a hobby by the name, and show the people on the hobby

    public void createHobby(Hobby hobby) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (hobby != null) {
            em.persist(hobby);
            System.out.println("You have successfully added: \n" + hobby.toString());
        } else {
            System.out.println("An error has occured. No object was added to the DB.");
        }
        em.getTransaction().commit();
        em.close();
    }

    public void deleteHobby(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Hobby hobbyToDelete = em.find(Hobby.class, id);
        if (hobbyToDelete != null) {
            System.out.println("Hobby with following information will now be deleted \n" + hobbyToDelete.toString());
            em.remove(hobbyToDelete);
        } else {
            System.out.println("An error has occured - No hobby was deleted");
        }
        em.getTransaction().commit();
        em.close();
    }



}