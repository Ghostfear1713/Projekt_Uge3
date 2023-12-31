package org.example;

import jakarta.persistence.*;

import java.util.List;

public class HobbyDAO {
    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    EntityManager em = emf.createEntityManager();



    public List<Person> getAllPersonsWithSpecificHobby(String hobby){
        em.getTransaction().begin();
        // :hobby is the parameter we set to the hobby we want to search for
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p WHERE LOWER(p.hobby) = LOWER(:hobby)", Person.class).setParameter("hobby", hobby);
        List<Person> personsWithHobbies = query.getResultList();
        for(Person person1 : personsWithHobbies){
            System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
            System.out.println("Hobby: " + person1.getHobby());
        }
        em.getTransaction().commit();
        em.close();
        return personsWithHobbies;
    }

    public Long getNumberOfPeopleWithHobby(String hobby) {
        em.getTransaction().begin();
        //We use Long and not long, since we want the numbers to have the count value to be represented
        //correctly - if no numbers are shown, the number can be null which is impossible if we used long
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(p) FROM Person p WHERE LOWER(p.hobby) = LOWER(:hobby)", Long.class).setParameter("hobby", hobby);
        Long count = query.getSingleResult();

        System.out.println("Number of people with the hobby " + hobby + ": " + count);

        em.getTransaction().commit();
        em.close();
        return count;
    }

    public void getAllHobbiesAndTheCount(){
        em.getTransaction().begin();
        TypedQuery<Object[]> query = em.createQuery("SELECT p.hobby, COUNT(p) FROM Person p GROUP BY p.hobby", Object[].class);
        List<Object[]> results = query.getResultList();
        for (Object[] o : results) {
            String hobby = (String) o[0];
            Long count = (Long) o[1];
            System.out.println("Hobby: " + hobby + ", Count: " + count);
        }
        em.getTransaction().commit();
        em.close();
    }

}
