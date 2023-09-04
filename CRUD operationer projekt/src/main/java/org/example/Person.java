package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

    public Person(String firstName, String lastName, String address, int phoneNumber, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person ID #" + id + ": " + "\nFirstName: " + firstName +
                " \nLastName: " + lastName +
                " \nAddress: " + address + "\nPhonenumber: " + phoneNumber + "\nEmail: " + email + "\nAge: " + age + " \n______________________________";
    }



}
