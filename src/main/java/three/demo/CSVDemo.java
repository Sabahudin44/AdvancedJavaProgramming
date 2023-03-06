package three.demo;

import org.example.one.Gender;
import two.collection.Person;
import two.collection.PersonCSVReader;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class CSVDemo {
    public static void main(String[] args) {

        Person person = new Person()
                .setGender(Gender.MALE)       //<-- bildanje objekta,building object
                .setName("Alden");



        PersonTester personTester = (p) -> p.getGender().equals(Gender.FEMALE);
        personTester.test(person);


        PersonCSVReader personCSVReader = new PersonCSVReader("persons.csv");
        List<Person> personList = personCSVReader.readPersonList();
        personList.stream().filter(p-> p.getGender().equals(Gender.FEMALE)).forEach(p-> System.out.println(p));
      //  printPersons(personList, p -> true);
     //   printPersons(personList, p -> p.getGender().equals(Gender.FEMALE));
      //  printPersons(personList, p -> p.getGender().equals(Gender.MALE));
      //  printPersons(personList, p -> p.getAge()>=20, p -> System.out.println(p) ); // ZA ovo PREDICATE I CONSUMER se oze koristiti
      //  printPersons(personList, p -> p.getAge()<20 );
      //  CSVDemo csvDemo = new CSVDemo();
        // csvDemo.printPersons(personList);
        // csvDemo.printFemalePersons(personList);
       //  csvDemo.printmalePersons(personList);
       //    csvDemo.printPersonsOlderThan(personList,20);
      // printPersonsYoungerThan(personList,20);   //MOZE ICI SAMO printPerson... ako ispred voida pise Static
    }

    static void printPersons(List<Person> personList, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        //ENHANCED Iterable<Person> ... Itderator<Person>
     //  for (Person person : personList ) { //(int i = 0; i < personList.size(); i++) INDEXINRANI ENHANCED
      //                                          //Person person = personList.get(i);
       //     if (personTester.test(person)) {
        //        System.out.println(person);
         //   }
       // }

        //Java 8 .... Spliterator<Person> Martin Fowler--FluentInterface
        personList.stream() //1. IZVOR
                .filter(personPredicate) //2. MEDZUOPERACIJA
                .forEach(personConsumer); //3. TERMINATE function





     //   Stream<Person> personStream = personList.stream();
     //   personStream = personStream.filter(p -> personTester.test(p));
      //          personStream.forEach(person -> System.out.println(person));


    }

    /**

    void printPersons(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println(person);

        }
    }

    void printFemalePersons(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getGender().equals(Gender.FEMALE)) {
                System.out.println(person);
            }


        }
    }

    void printmalePersons(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getGender().equals(Gender.MALE)) {
                System.out.println(person);
            }

        }
    }
    void printPersonsOlderThan(List<Person> personList, int age) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getAge() >= age) {
                System.out.println(person);
            }

        }
    }
    static void printPersonsYoungerThan(List<Person> personList, int age ) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getAge() < age);
            {
                System.out.println(person);
            }
        }*/
    }

