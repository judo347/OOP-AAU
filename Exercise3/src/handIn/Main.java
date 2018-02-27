package handIn;

import handIn.exceptions.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating building objects
        Building2Aparts building1with2Aparts = new Building2Aparts(5);
        Building3Aparts building2with3Aparts = new Building3Aparts(10);

        Scanner inputReader = new Scanner(System.in);
        String userInput;

        while(true){
            System.out.println("What apartment do you want to call (ex 4tv) (0 = exit): ");
            userInput = inputReader.nextLine();
            System.out.println("Calling apartment........");

            if(userInput.equals("0"))
                break;

            try{
                building2with3Aparts.call(userInput);
            } catch (IlligalAptException e){
                System.out.println(e.getErrorMsg());
            } catch (NoSuchAptException e){
                System.out.println(e.getErrorMsg());
            } catch (NoSuchFloorException e){
                System.out.println(e.getErrorMsg());
            }
        }
    }
}
