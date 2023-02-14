package three.demo;

import org.example.one.Gender;
import two.collection.Person;

public class FemalePersonTester implements PersonTester {

    @Override
    public boolean test(Person person) {
       boolean test = person.getGender().equals(Gender.FEMALE);
        return test;
    }
}
