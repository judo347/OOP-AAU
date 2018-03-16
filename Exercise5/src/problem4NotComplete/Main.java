package problem4NotComplete;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++)
            list.add(i);

        int forLoopSum = 0;
        int iteratorSum = 0;
        int streamSum = 0;

        //Loop
        for (int i = 0; i < list.size(); i++) {
            forLoopSum += list.get(i);
        }

        //Iterators
        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext())
            iteratorSum += iter.next();

        //Streams
        //ArrayList<String> r = list.stream().forEach(i -> streamSum += i);

        //OUT
        System.out.println(forLoopSum);
        System.out.println(iteratorSum);
        System.out.println(streamSum);
    }
}
