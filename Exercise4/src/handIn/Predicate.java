package handIn;

@FunctionalInterface
public interface Predicate<T> {
    T condition(T x);
}
