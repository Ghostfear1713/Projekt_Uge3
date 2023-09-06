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
    private int phoneNumber;
    private String email;
    private int age;
    private String hobby;

    public Person(String firstName, String lastName, String address, String email, int age, String hobby) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.hobby = hobby;
    }

    public Person(String firstName, String lastName, String address, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<PhoneNumber> phoneNumbersFromPerson = new HashSet<>();

    @Override
    public String toString() {
        return "Person ID #" + id + ": " + "\nFirstName: " + firstName +
                " \nLastName: " + lastName +
                " \nAddress: " + address + "\nPhonenumber: " + phoneNumber + "\nEmail: " + email + "\nAge: " + age + " \n______________________________";
    }

    public void addPersonNumber(PhoneNumber phoneNumber){
    this.phoneNumbersFromPerson.add(phoneNumber);
    if(phoneNumbersFromPerson != null){
        phoneNumber.setPerson(this);
        }
    }


}
