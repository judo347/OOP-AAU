package problem7;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list);

        Iterator<String> iter1 = list.iterator();
        Iterator<String> iter2 = list.iterator();
        TwoIterClass<String> ownDoubleIter = new TwoIterClass<>(iter1, iter2);


        while(ownDoubleIter.hasNext())
            System.out.println(ownDoubleIter.next());
    }
}
