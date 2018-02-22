package handIn;

public class Fruit implements ItemInterface {
    private String name;
    private int count;
    private int sizeInLiters;

    public Fruit(String name, int count, int sizeInLiters) {
        this.name = name;
        this.count = count;
        this.sizeInLiters = sizeInLiters;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSizeInLiters() {
        return this.sizeInLiters;
    }

    @Override
    public void printItem() {
        System.out.print("Item: " + this.name + ", count: " + this.count);
        System.out.println(", occupying: " + this.sizeInLiters * this.count + " L .");
    }
}
