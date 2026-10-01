public class HomeApp {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();

        System.out.println("--- Turning on individual services ---");
        home.turnOnLight();
        home.turnOnTV();

        System.out.println("\n--- Turning on everything ---");
        home.turnOnAll();

        System.out.println("\n--- Turning off everything ---");
        home.turnOffAll();

        System.out.println("\n--- Turning off air conditioning only ---");
        home.turnOffAirConditioning();
    }
}