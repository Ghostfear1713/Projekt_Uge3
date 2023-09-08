package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        Hobby hobby = new Hobby();
        HobbyDAO hobbyDAO = new HobbyDAO();
        PersonDAO persondao = new PersonDAO();




        PhoneNumberDAO phoneNumberDAO = new PhoneNumberDAO();
        PhoneNumber phoneNumber1 = new PhoneNumber("+45 35354949");
        PhoneNumber phoneNumber2 = new PhoneNumber("+45 30228291");
        PhoneNumber phoneNumber3 = new PhoneNumber("+45 21348293");
        PhoneNumber phoneNumber4 = new PhoneNumber("+45 23482931");
        PhoneNumber phoneNumber5 = new PhoneNumber("+45 24423465");
        PhoneNumber phoneNumber6 = new PhoneNumber("+45 20932222");
        PhoneNumber phoneNumber7 = new PhoneNumber("+45 52455423");
        PhoneNumber phoneNumber8 = new PhoneNumber("+45 83723321");
        PhoneNumber phoneNumber9 = new PhoneNumber("+45 24466589");
        PhoneNumber phoneNumber10 = new PhoneNumber("+45 44556677");
        PhoneNumber phoneNumber11 = new PhoneNumber("+45 99332111");
        PhoneNumber phoneNumber12 = new PhoneNumber("+45 42420612");

        Person p1 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", "drpjuskepusk@mail.dk", 53, "Professional Pimp", "Lyngby", AgeGroup.Adult);
        Person p2 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", "abdih@mail.dk", 25, "Professional Pimp", "Lyngby", AgeGroup.Adult);
        Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", "sofies@mail.dk", 28, "Professional Pimp", "Lyngby", AgeGroup.Adult);
        Person p4 = new Person("Orhan", "Secilmis", "Pilegårdsvej 61", "Uniton@live.dk", 27, "Professional Pimp", "Lyngby", AgeGroup.Adult);
        Person p5 = new Person("Kyle", "Johansen", "Vejlebrovej 115 1 mf", "Kyle@mail.dk", 50, "Swimming", "Lyngby", AgeGroup.Adult);
        Person p6 = new Person("Hermano", "Lorenzo", "Tuborgsvej 1", "Hermano@mail.dk", 22, "Swimming", "Lyngby", AgeGroup.Adult);
        Person p7 = new Person("Freak", "West", "Gangmøllersvej 86", "Freak@mail.dk", 16, "Tenis", "Lyngby", AgeGroup.Junior);
        Person p8 = new Person("Johnny", "Poulsen", "Odinsvej 23", "Johnny@live.dk", 33, "Tennis", "Hillerød", AgeGroup.Adult);
        Person p9 = new Person("Mogens", "Larsen", "Ballerupsvej 83 2. th", "Mogens@live.dk", 78, "Cricket", "Hillerød", AgeGroup.Senior);
        Person p10 = new Person("Celine", "Petersen", "Søllegård 17", "Celine@live.dk", 14, "Tennis", "Hillerød", AgeGroup.Junior);
        Person p11 = new Person("Foxy", "Love", "Vejlebrovej", "uniton@live.dk", 30, "Swimming", "Lyngby", AgeGroup.Adult);
        Person p12 = new Person("Foxiana", "Pure", "Hangover", "hahaa@live.dk", 30, "Shooting", "Lyngby", AgeGroup.Adult);
        Person p13 = new Person("Tania", "Gigantic", "Hangover", "hahaa@live.dk", 30,  "Lyngby", AgeGroup.Adult);

        Hobby hobby1 = new Hobby("Gaming");


        //Updating method to change ones firstName
//        Person oldPerson = persondao.findById(2);
//        oldPerson.setFirstName("Philip");
//        persondao.updatePerson(oldPerson);


          //create a person with a phone number
//          p1.addPersonNumber(phoneNumber1);
//          persondao.createPersons(p1);

        //adds are hobby and a phonenumber to a person by first taking in a hobby object and a phonenumber
        p13.addHobbyAndPhoneNumberToPerson(hobby1, phoneNumber1);
        persondao.createPersons(p13);


        //phoneNumberDAO.getAllPhoneNumbersByPersonNameCaseNoneSensitive("Ketild");


        //create a person with a phone number
//        Person personWeWantToAddNewPhoneNumberToo = persondao.findById(2);
//        personWeWantToAddNewPhoneNumberToo.addPersonNumber(phoneNumberDAO.createPhoneNumber(phoneNumber5));
//        persondao.updatePerson(personWeWantToAddNewPhoneNumberToo);
//        phoneNumberDAO.getAllPhoneNumbersByPersonNameCaseNoneSensitive("Abdi");





    }
}