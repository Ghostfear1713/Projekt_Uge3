package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        PersonDAO persondao = new PersonDAO();
        PhoneNumberDAO phoneNumberDAO = new PhoneNumberDAO();
        PhoneNumber phoneNumber = new PhoneNumber("42420612");
        PhoneNumber phoneNumber1 = new PhoneNumber("35354949");
        Hobby hobby = new Hobby();
        HobbyDAO hobbyDAO = new HobbyDAO();



        Person p1 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", "drpjuskepusk@mail.dk", 53);
        Person p2 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", "abdih@mail.dk", 25);
        Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", "sofies@mail.dk", 28);
        Person p4 = new Person("Orhan", "Secilmis", "Pilegårdsvej 61", "Uniton@live.dk", 27);
        Person p5 = new Person("Kyle", "Johansen", "Vejlebrovej 115 1 mf", "Kyle@mail.dk", 50, "Swimming");
        Person p6 = new Person("Hermano", "Lorenzo", "Tuborgsvej 1", "Hermano@mail.dk", 22, "Swimming");
        Person p7 = new Person("Freak", "West", "Gangmøllersvej 86", "Freak@mail.dk", 16, "Tenis");
        Person p8 = new Person("Johnny", "Poulsen", "Odinsvej 23", "Johnny@live.dk", 33, "Tennis");

        //hobbyDAO.getAllHobbiesFromPerson("Swimming");
//        String hobbyToCount = "Swimming";
//        Long count = hobbyDAO.getNumberOfPeopleWithHobby(hobbyToCount);
//        System.out.println("Number of people with the hobby " + hobbyToCount + ": " + count);

        //hobbyDAO.getNumberOfPeopleWithHobby("swimming");

        hobbyDAO.getAllHobiesAndTheCount();

        //p5.addPersonNumber(phoneNumber);

        //persondao.createPersons(p5);
        //persondao.getAllPersons();
        //phoneNumberDAO.getAllPhoneNumbersByPersonNameCaseNoneSensitive("Sofie");


    }

}