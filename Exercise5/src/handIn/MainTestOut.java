package handIn;


import handIn.people.Student;

/** CHECKLIST:
 *  Public/Private
 *      inf about people
 *
 * */

public class MainTestOut {
    public static void main(String[] args) {
        Student mikkel = new Student("Mikkel", "Kuntz", 23, 940415);

        System.out.println(mikkel.getFirstname());
    }

}
