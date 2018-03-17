package handIn.people;

public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private int dateOfBirth; //In the format YYMMDD

    public Person(String firstname, String lastname, int age, int dateOfBirth) {
        //TODO: Person inf check
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
