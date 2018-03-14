package handIn;

public class EmptyQueueException extends RuntimeException {

    private String errorMsg;

    public EmptyQueueException(){
        this.errorMsg = "The queue is empty!";
    }

    public String getErrorMsg(){
        return this.errorMsg;
    }
}
