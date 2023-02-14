package two.collection;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        PersonCSVReader personCSVReader = new PersonCSVReader("persons.csv");
        List<Person> personList = personCSVReader.readPersonList();
        for (int i = 0; i<personList.size(); i++){
            Person person = personList.get(i);
            System.out.println(person);
        }
        System.out.println("Another way of ENHANCED...");
        for (Person person : personList){
            System.out.println(person);
        }
     //   System.out.println();
      //  System.out.println("Pravi ENHANCED");
      //  personList.forEach(System.out::println);

        System.out.println();   // KAO OVAJ IZNAD SAMO ELEGANTNIJI zove se FUNCIONAL INTERFACE
        System.out.println("Pravi ENHANCED");
        personList.forEach(p -> System.out.println(p));
    }
}
