package task10;

public class Main {
    public static void main(String[] args) {

        Tram tram = new Tram("T-102");

        tram.toggleIsInUse();

        tram.driverName = "Ivan Petrov";
        tram.ticketInspectorName = "Anna Smirnova";

        System.out.println("Tram number: " + tram.getVehicleNumber());
        System.out.println("Engine type: " + tram.getVehicleEngine());
        System.out.println("Is in use: " + tram.isInUse());

        System.out.println("Crew:");
        System.out.println(tram.getCrewComposition());
    }
}