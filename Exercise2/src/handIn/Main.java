package handIn;

/** What i would like to do next / is missing:
 *  Error handling
 *  More tests (a lot more)
 *  Buy and expiration date (deleted what i had)
 *  More actions for the ArrayList
 *  Make size of fridge mean something
 */
public class Main {
    public static void main(String[] args) {

        //Creating your smart fridge!
        SmartFridge yourFridge = new SmartFridge("Cooler 2000", 120);

        //You can open and close the door
        yourFridge.openDoor();
        yourFridge.openDoor();
        yourFridge.closeDoor();

        //You can ask your fridge for ice cubes!
        yourFridge.getIceCubes(5);

        //You can get the temperature in Fahrenheit
        System.out.println("The temperature of the fridge is: " + yourFridge.getTemperatureF() + " F and " + yourFridge.getTemperatureC() + " C.");

        //Lets go shopping!
        Fruit apple = new Fruit("Apple", 1,1 );
        Fruit banana = new Fruit("Banana", 3, 1);
        Fruit peach = new Fruit("Peach", 3, 1);
        NonEdible termoMeter = new NonEdible("Termometer", 2);

        //And lets put them in the fridge
        yourFridge.addItem(apple);
        yourFridge.addItem(banana);
        yourFridge.addItem(peach);
        yourFridge.addItem(termoMeter);

        //We can show the items in the fridge
        yourFridge.showItemList();

        //And remove an item
        yourFridge.removeItemBySpecificNumber(0);
    }
}