package problem6;

public class Apple implements Fruit {

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getTaste() {
        return "Sour";
    }

    @Override
    public int getCalorieCount() {
        return 52;
    }
}
