package handIn.exceptions;

public class NoSuchFloorException extends RuntimeException{

    private String errorMsg;

    public NoSuchFloorException() {
        this.errorMsg = "No such floor. Please try again.";
    }

    public String getErrorMsg(){
        return this.errorMsg;
    }
}
