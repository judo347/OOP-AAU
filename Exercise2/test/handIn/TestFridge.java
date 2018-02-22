package handIn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Assertions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestFridge {

    Fridge fridge = null;
    int defSizeLiters = 120;
    String defName = "Cooler 2000";

    @BeforeEach
    public void beforeEach(){
        fridge = new Fridge(defName, defSizeLiters);
    }

    @Test
    public void doorState01(){
        Assertions.assertFalse(fridge.getDoorState()); //Should come closed
    }

    @Test
    public void openDoor01(){
        fridge.openDoor();
        Assertions.assertTrue(fridge.getDoorState()); //Should now be open
    }

    @Test
    public void openDoor02(){
        fridge.openDoor();
        fridge.openDoor();
        Assertions.assertTrue(fridge.getDoorState()); //Should still be open
    }

    @Test
    public void closeDoor01() {
        fridge.closeDoor();
        Assertions.assertFalse(fridge.getDoorState());
    }

    @Test
    public void closeDoor02() {
        fridge.openDoor();
        fridge.closeDoor();
        Assertions.assertFalse(fridge.getDoorState());
    }

    @Test
    public void getTemperatureC01(){
        Assertions.assertEquals(5, fridge.getTemperatureC()); //Should be default 5C
    }

    @Test
    public void setTemperature01(){
        fridge.setTemperature(10);
        Assertions.assertEquals(10, fridge.getTemperatureC());
    }

    @Test
    public void setTemperature02(){
        fridge.setTemperature(-10);
        Assertions.assertEquals(-10, fridge.getTemperatureC());
    }

    @Test
    public void getSizeLiters01(){
        Assertions.assertEquals(defSizeLiters, fridge.getSizeLiters()); //Default  value
    }

    @Test
    public void getName01(){
        Assertions.assertEquals(defName, fridge.getName());
    }


}
