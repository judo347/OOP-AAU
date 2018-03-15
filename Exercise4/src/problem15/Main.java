package problem15;

public class Main {

    public static void main(String[] args) {
        StringHandling sh = new StringHandling();

        System.out.println(sh.joinAll(new String[]{"a", "b", "c"}, (x, y) -> x + y); //"abc"

        System.out.println(sh.joinAll(new String[]{"a", "b", "c"}, (x, y) -> x + "." + y); //"a.b.c"

        System.out.println(sh.joinAll(new String[]{"a", "b", "c"}, (x, y) -> x); //"a"
    }
}
