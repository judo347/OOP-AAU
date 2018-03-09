package problem10;

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

    <C> Pair<C, B> setFst(C valueC){
        return new Pair<C, B>(valueC , valueB);
    }

    <C> Pair<A, C> setSnd(C valueC){
        return new Pair<A, C>(valueA, valueC);
    }
}
