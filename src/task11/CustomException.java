package task11;

public class CustomException extends Exception{
    public CustomException() {
        super("already in use");
    }
}
