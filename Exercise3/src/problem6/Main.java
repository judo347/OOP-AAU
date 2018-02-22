package problem6;

public class Main {
    public static void main(String[] args) {

        Person Mathias = new Person("Mathias", "NONE", 22, "151594-1937");
        Person Mikkel = new Person("Mikkel", "Hello", 23, "151594-1937");
        Person Nico = new Person("Mikkel", "Hello", 23, "151515-1937");

        System.out.println(Mathias.equals(Mikkel));
        System.out.println(Mathias.equals(Nico));
    }
}
