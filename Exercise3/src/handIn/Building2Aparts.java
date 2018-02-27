package handIn;

import handIn.exceptions.*;


/** This class is used to modulate an apartment building containing two apartments per floor (tv, th). */
public class Building2Aparts implements DoorPhone {

    private int numberOfFloors;

    /** The constructor.
     *  @param numberOfFloors numbers of floors in the building. */
    public Building2Aparts(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    /** Use this to call an apartment.
     *  @param apt an apartment call containing the number and postfix (tv, th). */
    @Override
    public boolean call(String apt) {
        String apartNumber = "";
        String postFix = "";

        //Reads the string and divide into apartment number and postfix.
        for(int i = 0; i < apt.length(); i++){
            if(isNumber(apt.charAt(i)))
                apartNumber += apt.charAt(i);
            else
                postFix += apt.charAt(i);
        }

        //Checks if the apartment request is valid:
        if(apartNumber.equals("") || postFix.equals("")) //Empty input?
            throw new IlligalAptException();
        else if(Integer.parseInt(apartNumber) < 1 || Integer.parseInt(apartNumber) > numberOfFloors) //Does the requested floor exist?
            throw new NoSuchFloorException();
        else if(!isValidPostfix(postFix)) //Valid postfix? (ex tv, th?)
            throw new NoSuchAptException();
        else
            return true;
    }

    /** This function is used to check if a char is a number (0-9).
     *  @param inputChar the char to be checked. */
    private boolean isNumber(char inputChar){
        switch (inputChar){
            case '0' :
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' :
            case '6' :
            case '7' :
            case '8' :
            case '9' : return true;
            default  : return false;
        }
    }

    /** This function checks if the postfix is a valid one.
     *  @param postfix an apartment postfix (tv, th). */
    private boolean isValidPostfix(String postfix){
        if(postfix.equals("tv"))
            return true;
        else if(postfix.equals("th"))
            return true;
        else
            return false;
    }
}
