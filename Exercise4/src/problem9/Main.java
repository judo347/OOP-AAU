package problem9;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> obj = new Pair<>(8, "HELLO");

        Pair<String, String> whut = new Pair<>("WHUT", "TUT");

        System.out.println(obj.getValueA() + obj.getValueB());

        Pair<String, Integer> obj2 = new Pair<>(8, "HELLO").swap();

        System.out.println(obj2.getValueA() + obj2.getValueB());


    }
}
