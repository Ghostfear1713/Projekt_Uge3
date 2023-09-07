package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        PersonDAO persondao = new PersonDAO();
        PhoneNumberDAO phoneNumberDAO = new PhoneNumberDAO();
        PhoneNumber phoneNumber = new PhoneNumber("+45 42420612");
        PhoneNumber phoneNumber1 = new PhoneNumber("+45 35354949");
        PhoneNumber phoneNumber2 = new PhoneNumber("+45 30228291");
        PhoneNumber phoneNumber3 = new PhoneNumber("+45 21348293");
        PhoneNumber phoneNumber4 = new PhoneNumber("+45 23482931");
        PhoneNumber phoneNumber5 = new PhoneNumber("+45 24423465");
        PhoneNumber phoneNumber6 = new PhoneNumber("+45 20932222");
        PhoneNumber phoneNumber7 = new PhoneNumber("+45 52455423");
        PhoneNumber phoneNumber8 = new PhoneNumber("+45 837233211");
        PhoneNumber phoneNumber9 = new PhoneNumber("24466589");
        PhoneNumber phoneNumbe10 = new PhoneNumber("+45 44556677");


        Hobby hobby = new Hobby();
        HobbyDAO hobbyDAO = new HobbyDAO();



        Person p1 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", "drpjuskepusk@mail.dk", 53, AgeGroup.Adult);
        Person p2 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", "abdih@mail.dk", 25, AgeGroup.Adult);
        Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", "sofies@mail.dk", 28, AgeGroup.Adult);
        Person p4 = new Person("Orhan", "Secilmis", "Pilegårdsvej 61", "Uniton@live.dk", 27, AgeGroup.Adult);
        Person p5 = new Person("Kyle", "Johansen", "Vejlebrovej 115 1 mf", "Kyle@mail.dk", 50, "Swimming", AgeGroup.Adult);
        Person p6 = new Person("Hermano", "Lorenzo", "Tuborgsvej 1", "Hermano@mail.dk", 22, "Swimming", AgeGroup.Adult);
        Person p7 = new Person("Freak", "West", "Gangmøllersvej 86", "Freak@mail.dk", 16, "Tenis", AgeGroup.Junior);
        Person p8 = new Person("Johnny", "Poulsen", "Odinsvej 23", "Johnny@live.dk", 33, "Tennis", AgeGroup.Adult);
        Person p9 = new Person("Mogens", "Larsen", "Ballerupsvej 83 2. th", "Mogens@live.dk", 78, "Cricket", AgeGroup.Senior);
        Person p10 = new Person("Celine", "Petersen", "Søllegård 17", "Celine@live.dk", 14, "Tennis", AgeGroup.Junior);

        Person p11 = new Person("Foxy", "Love", "Vejlebrovej", "uniton@live.dk", 30, "Swimming", "Lyngby", AgeGroup.Adult);
        Person p12 = new Person("Foxiana", "Pure", "Hangover", "hahaa@live.dk", 30, "Shooting", "Lyngby", AgeGroup.Adult);


        //hobbyDAO.getAllHobbiesFromPerson("Swimming");
//        String hobbyToCount = "Swimming";
//        Long count = hobbyDAO.getNumberOfPeopleWithHobby(hobbyToCount);
//        System.out.println("Number of people with the hobby " + hobbyToCount + ": " + count);

        //hobbyDAO.getNumberOfPeopleWithHobby("swimming");

        //hobbyDAO.getAllHobiesAndTheCount();

        p12.addPersonNumber(phoneNumber9);

        persondao.createPersons(p12);

        //persondao.getAllPersons();
        //phoneNumberDAO.getAllPhoneNumbersByPersonNameCaseNoneSensitive("Sofie");

        //persondao.getPersonsInCity("Lyngby");


    }

}