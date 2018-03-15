package problem15;

public class StringHandling implements Joinable {

    @Override
    public String joinAll(String[] array, Joinable f) {
        String temp  = "";
        for(String element : array) {
            temp = temp + element;
        }

        return temp;
    }
}
