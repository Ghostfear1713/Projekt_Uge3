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
public class PhoneNumber {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer iD;
 private String number;

@ManyToOne(cascade = CascadeType.PERSIST)
private Person person;

    public PhoneNumber(String number) {
        this.number = number;
    }
}
