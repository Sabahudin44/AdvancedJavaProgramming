package four.generic;

import org.example.one.Person;

public class BoxDemo {
    public static void main(String[] args) {

        Box<Double> aldenovaKutija = new Box<>();
        aldenovaKutija.setPolje(23.5);

        NumberBox<Double> aldenovaKutija2 = new NumberBox<>();
        aldenovaKutija2.setNumber(23.5);

        Box<String> dejlinaKutija = new Box<>();
        dejlinaKutija.setPolje("Dejla");
        NumberBox<Integer> dejlinaKutija2 = new NumberBox<>();
        dejlinaKutija2.setNumber(23);

        Person person = new Person();
        Box<Person> kenanovaKutija = new Box<>();
        kenanovaKutija.setPolje(person);
        NumberBox<Float> kenanovajutija2 = new NumberBox<>();
        kenanovajutija2.setNumber(23.5F);

    }
}
