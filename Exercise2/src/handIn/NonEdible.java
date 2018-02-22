package handIn;

public class NonEdible implements ItemInterface{
    private String name;
    private int sizeInLiters;

    public NonEdible(String name, int sizeInLiters) {
        this.name = name;
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
        System.out.print("Item: " + this.name);
        System.out.println(", occupying: " + this.sizeInLiters + " L .");
    }
}
