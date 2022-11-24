import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Person person=new Person();
        person.setFirstName("Meikinbek");
        person.setLastName("Alimbekov");
        person.setAge(128);
        person.setId(12);
        person.setEmail("meykin.alimbekovgmail.com");
        person.setPhoneNumber("+886928454945");

        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getId()+" "+person.getAge()+" "+person.getEmail()+" "+person.getPhoneNumber());
        person.placeOfWork();




    }
}
