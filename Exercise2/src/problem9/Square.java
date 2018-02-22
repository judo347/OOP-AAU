package problem9;

public class Square implements Shape {

    private double width;
    private double heigth;

    @Override
    public double totalArea() {
        return (this.width * this.heigth);
    }

    @Override
    public double circumference() {
        return (this.heigth * 2 + this.width * 2);
    }

    @Override
    public int numberOfEdges() {
        return 4;
    }
}
