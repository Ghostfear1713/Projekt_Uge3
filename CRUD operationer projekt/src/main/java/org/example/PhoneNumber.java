package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class PhoneNumber {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer iD;
 /* specifies a regular expression pattern for Danish phone numbers. The \\+45 \\d{8} pattern matches the format "+45"
    followed by eight digits. If the phone number doesn't match this format, a validation error message will be generated.*/
    private String number;

 //Will persist both the personobject and the phonenumber whenever we persist a person to DB
 @ManyToOne(cascade = CascadeType.PERSIST)
 private Person person;

    public PhoneNumber(String number) {
        this.number = number;
    }
}
