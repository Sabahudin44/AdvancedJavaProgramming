package org.example.one;
/*
Person p = new Person();
p.setName("Eldar");
p.setGender(Gender.FEMALE);
 */


/*
Person p1 = new Person();
p1.setName("Greta");
p1.setGender( Gender.FEMALE);
*/

import org.example.one.Gender;

public class Person {

    private String name;
    private  String surname;

    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
