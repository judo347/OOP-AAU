package problem8n9;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mikkel", "Kuntz", 22);
        Person person2 = new Person("Amanda", "Niess", 21);
        Person person3 = new Person("Mikkel", "Kuntz", 25);
        Person person4 = new Person("Amanda", "Kuntz", 21);

        HashSet<Person> personHASHset = new HashSet<>();
        personHASHset.add(person1);
        personHASHset.add(person2);
        personHASHset.add(person3);
        personHASHset.add(person4);

        //This shows that person 1 and 3 are the same so the set only keeps one of them (sets have unique elements)
        System.out.println(personHASHset);

    }
}
