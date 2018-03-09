package problem10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Pair<Integer, String> obj = new Pair<>(8, "HELLO");

        Pair<String, String> whut = new Pair<>("WHUT", "TUT");

        System.out.println("Test basic object");
        System.out.println(obj.getValueA() + obj.getValueB());

        //Swap
        Pair<String, Integer> obj2 = new Pair<>(8, "HELLO").swap();

        System.out.println("Test swap");
        System.out.println(obj2.getValueA() + obj2.getValueB());


        //SetFst and SetSnd
        Pair<Integer, Integer> obj3 = obj2.setFst(6);
        Pair<Integer, String> obj4 = obj3.setSnd("mk");

        System.out.println("Test SetFst and SetSnd");
        System.out.println(obj3.getValueA() + obj4.getValueB());

    }
}
