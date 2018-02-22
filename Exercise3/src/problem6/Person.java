package problem6;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String socialSecurityNumber;

    public Person(String firstName, String lastName, int age, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(socialSecurityNumber, person.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }
}
