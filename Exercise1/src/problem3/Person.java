package problem3;

public class Person {

    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBodyMassIndex(){
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        return (this.weight / ((this.height/ 100) * (this.height/ 100)));
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
