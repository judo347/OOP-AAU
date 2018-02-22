package handIn;

import java.util.concurrent.TimeUnit;

/** This class represents a smart fridge.
 *  It has the same functionality as the normal one but with a "lot" of extra features. */
public class SmartFridge extends Fridge {
    public SmartFridge(String name, int sizeLiters) {
        super(name, sizeLiters);
    }

    /** Takes an amount of desired ice cubes and "dispenses" them.
     * @param amount */
    public void getIceCubes(int amount){
        System.out.println("You have asked for " + amount + " ice cubes.");
        System.out.println("Please hold your cup under the tap.");
        for(int i = 0; i < amount; i++) {
            if(i == 0)
                System.out.print("Flunk");
            else{
                /* Cooldown before next icecube can be dispensed */
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(", flunk");
            }
        }

        System.out.println(".");
    }

    public double getTemperatureF(){
        return this.getTemperatureC() * 1.8 + 32;
    }
}
