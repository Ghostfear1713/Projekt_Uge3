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

@Table(name = "cityinfo")
public class CityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zip;

    private String city_name;

    private String region_name;

    private String municipality_name;

    @OneToMany(mappedBy = "zip") // mappedBy refers to the 'zipcode' field in the Person entity
    private List<Person> persons;


    public CityInfo(Integer zip, String city_name) {
        this.zip = zip;
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "ZipCode: " + zip + "\n" +
                "City Name: " + city_name + "\n" +
                "Region Name: " + region_name + "\n" +
                "Municipality Name: " + municipality_name + "\n" +
                "______________________________";
    }
}
