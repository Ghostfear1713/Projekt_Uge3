package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PhoneNumberDAO {

    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    EntityManager em = emf.createEntityManager();

    public List<String> getPhoneNumbersByPersonName(String personName){
        //The query takes the number from our Phonenumber entity class (p.number FROM PhoneNumber)
        //(WHERE p.persom-first = :name) this restricts the results to phone numbers that meet a specific criteria
        //p.person is the person to whom the phone number belongs.
        //p.person.firstName specifies the firstName attribute of the associated Person entity. We're filtering based on
        // the first name of the person associated with the phone number.
        // =:name: This part involves a parameter in the query. :name is a placeholder for a value that will be provided
        // later when the query is executed. The = operator is used to compare the firstName of the associated person with the provided value.
        TypedQuery<String> query = em.createQuery("SELECT p.number FROM PhoneNumber p WHERE p.person.firstName = :name", String.class);
        query.setParameter("name", personName);
        return query.getResultList();
    }

    public void getAllPhoneNumbersByPersonNameCaseNoneSensitive(String personName){
        em.getTransaction().begin();
        //LOWER converts the input parameter "personName" to lowercase before comparing it to the lowercase version of the firstname in the db
        em.createQuery("SELECT p.number FROM PhoneNumber p WHERE LOWER(p.person.firstName) = LOWER(:name)", String.class).setParameter("name", personName).getResultList().forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
    }





}
