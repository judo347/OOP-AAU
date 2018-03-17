package problem11;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {

        return firstname + " " + lastname + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }

    @Override
    public int compareTo(Person that) {
        if(this.firstname.equals(that.firstname)){
            if(this.lastname.equals(that.lastname)){
                return this.age - that.age;
            }

            return this.lastname.compareTo(that.lastname);
        }

        return this.firstname.compareTo(that.firstname);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}
