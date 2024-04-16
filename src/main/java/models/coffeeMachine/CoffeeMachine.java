package models.coffeeMachine;

import models.coffeeMachine.Interfases.ICoffeeDrink;
import models.coffeeMachine.Interfases.ICoffeeMachine;
import models.coffeeMachine.enums.CoffeeFortress;
import models.coffeeMachine.enums.CoffeeVolume;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CoffeeMachine implements ICoffeeMachine {
    private final List<ICoffeeDrink> coffeeDrinks;

    public CoffeeMachine() {
        this.coffeeDrinks = new ArrayList<>();
    }

    public void addCoffeeDrink(ICoffeeDrink coffeeDrink) {
        this.coffeeDrinks.add(coffeeDrink);
    }

    public String getCoffeeMachineMenu() {
        StringBuilder menu = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(1);
        for (ICoffeeDrink coffeeDrink : this.coffeeDrinks) {

            menu.append("Choice ").append(counter.getAndIncrement()).append(" to get => ").append(coffeeDrink.getCoffeeDrinkName()).append("\n");
        }
        menu.append("Choice 0 to exit");
        return menu.toString();
    }

    public String getCoffeeDrinkIngredients(int coffeeDrinkIndex) {
        ICoffeeDrink coffeeDrink = this.coffeeDrinks.get(coffeeDrinkIndex);
        return coffeeDrink.getCoffeeDrinkIngredients();
    }

    public ICoffeeDrink makeCoffeeDrink(int coffeeDrinkIndex, int coffeeFortressInt, int coffeeVolumeInt) {
        ICoffeeDrink coffeeDrink = this.coffeeDrinks.get(coffeeDrinkIndex);
        coffeeDrink.setCoffeeDrinkByDefault();
        CoffeeFortress coffeeFortress = CoffeeFortress.fromValue(coffeeFortressInt);
        CoffeeVolume coffeeVolume = CoffeeVolume.fromValue(coffeeVolumeInt);
        coffeeDrink.setCoffeeFortress(coffeeFortress);
        coffeeDrink.setCoffeeVolume(coffeeVolume);
        coffeeDrink.coffeeDrinkPrepare();
        return coffeeDrink.getCoffeeDrink();
    }

    public int getCoffeeDrinksCount() {
        return this.coffeeDrinks.size();
    }

    public String getCoffeeVolumeMenu() {
        StringBuilder menu = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(1);
        for (CoffeeVolume coffeeVolume : CoffeeVolume.values()) {
            menu.append("Choice ").append(counter.getAndIncrement()).append(" to get => ").append(coffeeVolume).append("\n");
        }
        return menu.toString();
    }

    public String getCoffeeFortressMenu() {
        StringBuilder menu = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(1);
        for (CoffeeFortress coffeeFortress : CoffeeFortress.values()) {
            menu.append("Choice ").append(counter.getAndIncrement()).append(" to get => ").append(coffeeFortress).append("\n");
        }
        return menu.toString();
    }
}
