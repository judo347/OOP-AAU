package handIn.exceptions;

public class IlligalAptException extends RuntimeException {

    private String errorMsg;

    public IlligalAptException() {
        this.errorMsg = "Your input was invalid. Please try a different apartment.";
    }

    public String getErrorMsg(){
        return this.errorMsg;
    }
}
