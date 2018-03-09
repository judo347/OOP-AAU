package problem7;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(5);

        System.out.println(box.getElement());

        try {
            box.setElement(null);
        }catch (IllegalArgumentException e){ //TODO: Not working
            System.out.println("You passed null!!");
        }
    }
}
