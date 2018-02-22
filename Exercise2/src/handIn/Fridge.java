package handIn;

import java.util.ArrayList;

/** This class represents a normal boring standard fridge */
public class Fridge {

    private boolean doorState; //True = open, false = closed
    private String name;
    private int sizeLiters;
    private int temperature;
    private ArrayList<ItemInterface> itemList = new ArrayList<>();

    public Fridge(String name, int sizeLiters) {
        this.doorState = false;
        this.name = name;
        this.sizeLiters = sizeLiters;
        this.temperature = 5;
    }

    /** Gets the state of the door (open/closed)
     * @return returns false if closed, and true if open. */
    public boolean getDoorState() {
        return doorState;
    }

    public void closeDoor(){
        if (doorState == true)
            System.out.println("The door has been closed!");
        else
            System.out.println("The door is already closed!");

        this.doorState = false;
    }

    public void openDoor(){
        if (doorState == false)
            System.out.println("The door has been opened!");
        else
            System.out.println("The door is already open!");
        this.doorState = true;
    }

    public String getName() {
        return name;
    }

    public int getSizeLiters() {
        return sizeLiters;
    }

    public int getTemperatureC() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /** This section handles the ArrayList which is a list of the items contained in the fridge */
    public void showItemList(){
        if(itemList.isEmpty())
            System.out.println("The fridge does not currently contain any items!");
        else{
            System.out.println("Here is a list of the items in the fridge:");
            for(int i = 0; i < itemList.size(); i++){
                itemList.get(i).printItem();
            }
        }
    }

    public void addItem(ItemInterface item){
        itemList.add(item);
    }

    public void removeItemBySpecificNumber(int num){
        itemList.remove(num);
        System.out.println(itemList.get(num).getName() + " has been deleted!");
    }
}
