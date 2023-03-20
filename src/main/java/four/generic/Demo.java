package four.generic;

import org.example.one.Gender;
import org.example.one.Person;
import three.homework.Container;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //raw Type
        Container container = new Container();

        //person container
        Person person = new Person();
        person.setName("Mirsad");
        person.setSurname("Škandro");
        person.setGender(Gender.MALE);

        Person person2 = new Person();
        person2.setName("Dejla");
        person2.setSurname("Šarić");
        person2.setGender(Gender.FEMALE);

        Container<Person> personContainer = new Container<>();
        personContainer.add(person);
        personContainer.add(person);
        personContainer.add(person2);

        personContainer.remove(person);
        for (Person p : personContainer){
            System.out.println(p);
        }

        ArrayList<Person> personArrayList = new ArrayList<>();


    }
}
