package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PhoneNumberDAO {

    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    EntityManager em = emf.createEntityManager();


    public void getAllPhoneNumbersByPersonNameCaseNoneSensitive(String personName){
        em.getTransaction().begin();
        //LOWER converts the input parameter "personName" to lowercase before comparing it to the lowercase version of the firstname in the db
        em.createQuery("SELECT p.number FROM PhoneNumber p WHERE LOWER(p.person.firstName) = LOWER(:name)", String.class).setParameter("name", personName).getResultList().forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
    }

    public PhoneNumber createPhoneNumber(PhoneNumber phoneNumber){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phoneNumber);
        em.getTransaction().commit();
        em.close();
        return phoneNumber;
    }



}
