package models.coffeeMachine.coffeeDrinks;

import models.coffeeMachine.Interfases.ICoffeeDrink;
import models.coffeeMachine.enums.CoffeeFortress;
import models.coffeeMachine.enums.CoffeeVolume;

public class Espresso implements ICoffeeDrink {
    private String espressoPrepareStatus;
    private CoffeeFortress coffeeFortress;
    private CoffeeVolume coffeeVolume;


    public void setCoffeeFortress(CoffeeFortress coffeeFortress) {
        this.coffeeFortress = coffeeFortress;
    }

    public void setCoffeeVolume(CoffeeVolume coffeeVolume) {
        this.coffeeVolume = coffeeVolume;
    }

    public String getCoffeeDrinkIngredients() {
        return """
            Ingredients:
            - 1/0 espresso
            """;
    }

    public void coffeeDrinkPrepare() {
        // some logic preparing espresso
        this.espressoPrepareStatus = String.format("Your %s. Enjoy :)", this.getCoffeeDrinkName());
    }

    public String getCoffeeDrinkName() {
        return "Espresso";
    }

    public ICoffeeDrink getCoffeeDrink() {
        return this;
    }

    public void setCoffeeDrinkByDefault() {
        this.espressoPrepareStatus = "Espresso is not prepared yet.";
        this.coffeeFortress = CoffeeFortress.MEDIUM;
        this.coffeeVolume = CoffeeVolume.MEDIUM;
    }

    public String getCoffeeDrinkPrepareStatus() {
        return this.espressoPrepareStatus;
    }

    public CoffeeVolume getCoffeeVolume() {
        return this.coffeeVolume;
    }

    public CoffeeFortress getCoffeeFortress() {
        return this.coffeeFortress;
    }
}
