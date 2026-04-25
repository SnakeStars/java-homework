package task13;

public class CustomResource implements java.lang.AutoCloseable {

    String info;
    int blank = 2;

    public CustomResource() {
        info = this.toString();
    }

    public String readInfoSuccessful() {
        return info;
    }

    public String readInfoFailure() {
        if (2+blank == 4){
            throw new RuntimeException();
        }

        return info;
    }

    @Override
    public void close() {
        System.out.println("закрытие ресурса");
    }
}
