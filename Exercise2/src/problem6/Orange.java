package problem6;

public class Orange implements Fruit {
    @Override
    public String getColor() {
        return "Orange";
    }

    @Override
    public String getTaste() {
        return "Sweet";
    }

    @Override
    public int getCalorieCount() {
        return 20;
    }
}
