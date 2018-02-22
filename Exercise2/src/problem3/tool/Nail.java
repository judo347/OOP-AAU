package problem3.tool;

public class Nail {
    private int length;
    private int weidth;
    private String color;

    public Nail(int length, int weidth, String color) {
        this.length = length;
        this.weidth = weidth;
        this.color = color;
    }

    public Nail(int length, int weidth) {
        this.length = length;
        this.weidth = weidth;
        this.color = "";
    }
}
