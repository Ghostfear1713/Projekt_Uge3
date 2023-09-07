import java.util.List;

public class Main {
    public static void main(String[] args) {

        CityInfo cityinfo = new CityInfo(2800, "Lyngby");

        Person p2 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", 34362359, "drpjuskepusk@mail.dk", 53, "Fiskeri", cityinfo);
        //Person p1 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", 22436579, "abdih@mail.dk", 25, "Fiskeri", 3400);
        //Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", 76414721, "sofies@mail.dk", 28, "Fiskeri", 2800);
        //Person p4 = new Person("Anne-Mette", "Rasmussen", "Nørrebrogade, 8. 3. tv.", 82324567, "AN@mail.dk", 28, "Fiskeri", 2800);

        PersonDAO persondao = new PersonDAO();
        HobbyDAO hobbyDAO = new HobbyDAO();
        CityInfoDAO cityInfoDAO = new CityInfoDAO();


        //persondao.createPersons(p1);
        //persondao.createPersons(p2);
        //persondao.createPersons(p3);
        //persondao.getAllPersons();
        //persondao.deletePerson();

        //cityInfoDAO.getAllZipcodes();

        //persondao.getInformationByPhoneNumber(34362359);

        //persondao.findByZip(cityinfo);

        //List<Person> persons = persondao.getPersonInACity("2800 Lyngby");

        persondao.getPersonByZip("Lyngby");


    }
}
