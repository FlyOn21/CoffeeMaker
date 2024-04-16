import controllers.CoffeeMachineController;

public class App {
    private final CoffeeMachineController startApp = new CoffeeMachineController();

    public void run() {
        startApp.coffeeMachineInit();
    }

    public static void main(String[] args) {
        new App().run();
    }
}
