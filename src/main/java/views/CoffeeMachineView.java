package views;

import models.coffeeMachine.CoffeeMachine;
import models.coffeeMachine.Interfases.ICoffeeDrink;
import utils.InputValidation;

import java.util.Scanner;

public class CoffeeMachineView {
    private final CoffeeMachine coffeeMachine;

    public CoffeeMachineView(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    private void printMenu() {
        System.out.println("Coffee Machine Menu\n");
        System.out.println(this.coffeeMachine.getCoffeeMachineMenu());
    }

    private int getValidInput(Scanner scanner, String prompt, String errorMessage, InputValidation.ValidationType type, int max) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        while (!InputValidation.isValid(input, type, max)) {
            System.out.println(errorMessage);
            input = scanner.nextLine();
        }
        return Integer.parseInt(input);
    }

    public void coffeeMachineProcessing(Scanner scanner) {


        while (true) {
            printMenu();
            int drinkNumber = getValidInput(scanner, "Enter the number of the drink (or 0 to exit):",
                    "Invalid choice input. Please try again.",
                    InputValidation.ValidationType.COFFEE_NUMBER,
                    coffeeMachine.getCoffeeDrinksCount());

            if (drinkNumber == 0) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println(coffeeMachine.getCoffeeDrinkIngredients(drinkNumber - 1));
            System.out.println(coffeeMachine.getCoffeeFortressMenu());
            int fortress = getValidInput(scanner, "Enter fortress:",
                    "Invalid fortress input. Please try again.",
                    InputValidation.ValidationType.FORTRESS_NUMBER,
                    3);

            System.out.println(coffeeMachine.getCoffeeVolumeMenu());

            int volume = getValidInput(scanner, "Enter volume:",
                    "Invalid volume input. Please try again.",
                    InputValidation.ValidationType.VOLUME_NUMBER,
                    3);

            ICoffeeDrink coffee = coffeeMachine.makeCoffeeDrink(drinkNumber - 1, fortress, volume);
            System.out.printf("Your coffee: fortress %s, volume %s%n%s%n",
                    coffee.getCoffeeFortress(),
                    coffee.getCoffeeVolume(),
                    coffee.getCoffeeDrinkPrepareStatus());
            System.out.println();
        }
    }
}

