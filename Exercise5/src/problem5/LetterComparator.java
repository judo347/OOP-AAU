package problem5;

import java.util.Comparator;

public class LetterComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);

        /* Works too but only with the first letter
        if(o1.charAt(0) < o2.charAt(0))
            return -1;
        else if(o1.charAt(0) > o2.charAt(0))
            return 1;
        else
            return 0;
        */
    }
}
