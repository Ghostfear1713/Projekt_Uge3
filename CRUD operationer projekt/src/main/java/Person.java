import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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
    private String hobbyName;

    @ManyToOne
    @JoinColumn(name = "zip") //foreign key column in the Person table
    private CityInfo zip;

    @ManyToOne
    @JoinColumn(name = "hobby_id")
    private Hobby hobby;

    @ManyToMany
    @JoinTable(name = "person_hobby", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "hobby_id"))
    private List<Hobby> hobbies;

    public Person(String firstName, String lastName, String address, int phoneNumber, String email, int age, String hobbyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.hobbyName = hobbyName;
    }

    @Override
    public String toString() {
        return "Person ID #" + id + ": " + "\nFirstName: " + firstName +
                " \nLastName: " + lastName +
                " \nAddress: " + address + "\nPhonenumber: " + phoneNumber + "\nEmail: " + email + "\nAge: " + age + " \n______________________________";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }
}
