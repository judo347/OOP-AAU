package problem6;

import java.util.ArrayList;

public class doubleList {
    public static <T> ArrayList<T> doubleListMethod(ArrayList<T> array){
        ArrayList<T> newArray = new ArrayList<>();

        for (T element : array){
            newArray.add(element);
            newArray.add(element);
        }

        return newArray;
    }
}
