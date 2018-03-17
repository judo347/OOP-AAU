package problem7;

import java.util.Iterator;

public class TwoIterClass<T> implements Iterator<T> {

    Iterator<T> n1;
    Iterator<T> n2;



    public TwoIterClass(Iterator<T> n1, Iterator<T> n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public boolean hasNext() {
        return n1.hasNext() || n2.hasNext();
    }

    @Override
    public T next() {
        if(n1.hasNext())
            return n1.next();
        else if(n2.hasNext())
            return n2.next();
        else
            return null;
    }



    /*


    @Override
    public boolean hasNext() {
        T next();
        return false;
    }

    @Override
    public T next() {
        return null;
    }
    */
}
