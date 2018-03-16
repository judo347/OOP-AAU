package problem5;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list = filllist(list);

        System.out.println("Before sort:");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list.sort(new LetterComparator());

        System.out.println("After sort:");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static public ArrayList<String> filllist(ArrayList<String> list){
        String[] words = new String[] {"cuiusvis", "hominis", "est", "errare", "nullius", "nisi", "insipientis", "in", "errore", "perseverare"};

        for (String word : words)
            list.add(word);

        return list;
    }

}
