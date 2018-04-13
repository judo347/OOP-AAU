package handIn;

public class DirectoryPathException extends RuntimeException {

    private String errorMsg;

    public DirectoryPathException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
