package problem12;

public class Main {
    public static void main(String[] args) {

        String test1 = reduce3("1", "2","3", (x, y) -> x + y); //=123
        String test2 = reduce3("1", "2","3", (x, y) -> x + "." + y); //=1.2.3
        String test3 = reduce3("1", "2","3", (x, y) -> x); //=1



        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

    }

    static String reduce3(String a, String b, String c, Joinable f){
        /*THIS:
        String temp = "";
        temp = f.join(a, b);
        temp = f.join(temp, c);

        return temp;
        Or the following line: */

        return f.join(f.join(a, b), c);
    }
}
