package problem7;

public class Point3 extends Point2{

    private int z;

    public Point3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}
