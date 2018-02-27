package handIn.exceptions;

public class NoSuchAptException extends RuntimeException {

    private String errorMsg;

    public NoSuchAptException() {
        this.errorMsg = "No such apartment. Please try again.";
    }

    public String getErrorMsg(){
        return this.errorMsg;
    }
}
