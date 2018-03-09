package problem7;

public class Box<T>{

    private T element;

    public Box(T element) {
        if (element == null)
            throw new IllegalArgumentException();
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
