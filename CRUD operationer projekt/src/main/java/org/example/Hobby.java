package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iD;
    String hobbyName;


    //Will persist both the personobject and the hobby whenever we persist a person to DB
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Person person;

    public Hobby(String hobbyName) {
        this.hobbyName = hobbyName;
    }
}
