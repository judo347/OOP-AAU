package problem9;

public class Pair<A, B> {

    private A valueA;
    private B valueB;

    public Pair(A valueA, B valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public A getValueA() {
        return valueA;
    }

    public B getValueB() {
        return valueB;
    }

    public Pair<B, A> swap(){
        return new Pair<>(valueB, valueA);
    }
}
