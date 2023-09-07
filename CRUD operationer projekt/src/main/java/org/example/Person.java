package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity


public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int age;
    private String hobby;
    private String city;


    public Person(String firstName, String lastName, String address, String email, int age, String hobby, AgeGroup ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.hobby = hobby;
        this.ageGroup = ageGroup;
    }

    public Person(String firstName, String lastName, String address, String email, int age, AgeGroup ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.ageGroup = ageGroup;
    }

    public Person(String firstName, String lastName, String address, String email, int age, String hobby, String city, AgeGroup ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.hobby = hobby;
        this.city = city;
        this.ageGroup = ageGroup;
    }

    @Enumerated(EnumType.STRING)
    private AgeGroup ageGroup;

    //fetchtype.eager = loads everything from a person (Lazy error fixed with fetch)
    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<PhoneNumber> phoneNumbersFromPerson = new HashSet<>();

    @Override
    public String toString() {
        return "Person ID #" + id + ": " + "\nFirstName: " + firstName +
                " \nLastName: " + lastName +
                " \nAddress: " + address + "\nHobby: " + hobby + "\nEmail: " + email + "\nAge: " + age + " \n______________________________";
    }

    public void addPersonNumber(PhoneNumber phoneNumber){
    this.phoneNumbersFromPerson.add(phoneNumber);
    if(phoneNumbersFromPerson != null){
        phoneNumber.setPerson(this);
        }
    }


}
