package task13;

public class Main {

    public static void main(String[] args) {
        Storage storage1 = new Storage();
        Storage storage2 = new Storage();

        storage1.openStorageSuccessful();
        System.out.println(storage1.getInfo());
        storage2.openStorageFailure();
        System.out.println(storage2.getInfo());
    }
}
