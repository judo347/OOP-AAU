package problem15;

@FunctionalInterface
public interface Joinable {
    String joinAll(String[] array, Joinable f);
}
