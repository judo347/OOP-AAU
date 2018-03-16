package problem6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("a");
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("c");

        ArrayList<String> newArray = doubleList.doubleListMethod(array);

        for(String element : newArray)
            System.out.print(element);
    }
}
