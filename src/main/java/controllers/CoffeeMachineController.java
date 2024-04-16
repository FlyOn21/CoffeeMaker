package controllers;

import models.coffeeMachine.CoffeeMachine;
import models.coffeeMachine.coffeeDrinks.Cappuccino;
import models.coffeeMachine.coffeeDrinks.Latte;
import views.CoffeeMachineView;
import models.coffeeMachine.coffeeDrinks.Espresso;

import java.util.Scanner;

public class CoffeeMachineController {
    public void coffeeMachineInit() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffeeDrink(new Espresso());
        coffeeMachine.addCoffeeDrink(new Cappuccino());
        coffeeMachine.addCoffeeDrink(new Latte());

        CoffeeMachineView coffeeMachineView = new CoffeeMachineView(coffeeMachine);
        Scanner scanner = new Scanner(System.in);
        coffeeMachineView.coffeeMachineProcessing(scanner);
        scanner.close();
    }
}
