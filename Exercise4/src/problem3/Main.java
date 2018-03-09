package problem3;

public class Main {
    public static void main(String[] args) {
        System.out.println(select(5,6,true));
        System.out.println(select(5,6,false));

        System.out.println(select("true","false",true));
        System.out.println(select("true","false",false));
    }

    static <T> T select(T x, T y, boolean b){

        return b ? x : y;
    }
}
