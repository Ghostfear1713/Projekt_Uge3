public class Main {
    public static void main(String[] args) {

        Person p2 = new Person("Ketild", "Hansen", "Pjuskepuskvej 32", 34362359, "drpjuskepusk@mail.dk", 53, "Fiskeri");
        Person p1 = new Person("Abdi", "Hamad", "Pilegaardsvej, 38. st. tv.", 22436579, "abdih@mail.dk", 25, "Fiskeri");
        Person p3 = new Person("Sofie", "Soerensen", "Strandstræde, 8. 3. tv.", 76414721, "sofies@mail.dk", 28, "Fiskeri");

        PersonDAO persondao = new PersonDAO();
        HobbyDAO hobbyDAO = new HobbyDAO();
        CityInfoDAO cityInfoDAO = new CityInfoDAO();

        //persondao.createPersons(p1);
        //persondao.createPersons(p2);
        //persondao.createPersons(p3);
        //persondao.getAllPersons();
        //persondao.deletePerson();

        //cityInfoDAO.getAllZipcodes();

        persondao.getInformationByPhoneNumber(34362359);

        }
    }
