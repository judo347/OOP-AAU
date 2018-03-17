package handIn.exceptions;

public class IllegalUniversityException extends RuntimeException {

    private String errorMsg;

    public IllegalUniversityException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
