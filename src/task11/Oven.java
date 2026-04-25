package task11;

public class Oven {
    boolean isInUse = false;

    void useOven() throws CustomException {
        if (isInUse) {
            throw new CustomException();
        }
        isInUse = true;
    }
}
