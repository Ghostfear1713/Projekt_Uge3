import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CityInfoDAO {


    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    public void getAllZipcodes() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("SELECT c FROM CityInfo c", CityInfo.class).getResultList().forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
    }

}