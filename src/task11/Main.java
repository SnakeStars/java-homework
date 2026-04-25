package task11;

public class Main {
    public static void main(String[] args) {
        Oven oven1 = new Oven();
        try {
            oven1.useOven();
            System.out.println("first usage successful");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            oven1.useOven();
            System.out.println("second usage successful");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
