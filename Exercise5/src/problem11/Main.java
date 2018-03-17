package problem11;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mikkel", "Kuntz", 25);
        Person person2 = new Person("Amanda", "Niess", 21);
        Person person3 = new Person("Mikkel", "Kuntz", 22);
        Person person4 = new Person("Amanda", "Kuntz", 21);
        Person person5 = new Person("Britney", "Lump", 5);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        //This shows that person 1 and 3 are the same so the set only keeps one of them (sets have unique elements)
        System.out.println(personList);

        Collections.sort(personList);

        System.out.println(personList);
    }
}
