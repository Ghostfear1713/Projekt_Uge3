package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {

        Person p2 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", 34362359, "drpjuskepusk@mail.dk", 53);
        Person p1 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", 22436579, "abdih@mail.dk", 25);
        Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", 76414721, "sofies@mail.dk", 28);

        PersonDAO persondao = new PersonDAO();
        //persondao.createPersons(p2);
        //persondao.getAllPersons();
        persondao.deletePerson(8);

    }

}