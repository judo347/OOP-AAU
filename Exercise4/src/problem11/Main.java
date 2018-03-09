package problem11;

public class Main {
    public static void main(String[] args) {
        Dict<Integer, String> dic = new Dict<>();

        try {
            dic.put(1, "Hello");
            dic.put(5, "NOPE");
            System.out.println(dic.get(1));
            System.out.println(dic.get(5));

            dic.put(1, "New Overwritten");
            System.out.println(dic.get(1));
        }catch (IllegalArgumentException e){
            System.out.println("Invalid key: No such item.");
        }
    }
}
