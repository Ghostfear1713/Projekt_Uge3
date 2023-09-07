package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class PersonDAO {

    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    public void createPersons(Person person){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if(person != null){
            em.persist(person);
            System.out.println("You have successfully added: \n" + person.toString());
        } else{
            System.out.println("An error has occured. No object was added to the DB.");
        }
        em.getTransaction().commit();
        em.close();
    }

    public Person findById (int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        //em.find - We're searching in the class, Person, and want to find the ID attribute
        Person foundPerson = em.find(Person.class, id);
        if(foundPerson == null){
            System.out.println("The ID you provided does not exist");
        }
        em.close();
        return  foundPerson;
    }

    public Person updatePerson(Person person){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person updatedPerson = em.merge(person);
        em.getTransaction().commit();
        em.close();
        return updatedPerson;
    }

    public void deletePerson(int id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person personToDelete = em.find(Person.class, id);
        if(personToDelete != null){
            System.out.println("Person with following information will now be deleted \n" + personToDelete.toString());
            em.remove(personToDelete);
        } else{
            System.out.println("An error has occured - No person was deleted");
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Person> getAllPersons(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Person> personList = em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
        personList.forEach(System.out::println);
        em.getTransaction().commit();
        em.close();
        return personList;
    }

    //TODO
    //MAKE A METHOD THAT UPDATES A PHONENUMBER

//    public void updatePerson(int id){
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Person mergedPerson = findById(1);
//
//        em.getTransaction().commit();
//        em.close();
//    }



}
