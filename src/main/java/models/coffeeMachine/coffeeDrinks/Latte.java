package models.coffeeMachine.coffeeDrinks;

import models.coffeeMachine.Interfases.ICoffeeDrink;
import models.coffeeMachine.enums.CoffeeFortress;
import models.coffeeMachine.enums.CoffeeVolume;

public class Latte implements ICoffeeDrink {
    private String lattePrepareStatus;
    private CoffeeFortress coffeeFortress;
    private CoffeeVolume coffeeVolume;

    public Latte() {
        this.lattePrepareStatus = "Latte is not prepared yet.";
    }

    public void setCoffeeFortress(CoffeeFortress coffeeFortress) {
        this.coffeeFortress = coffeeFortress;
    }

    public void setCoffeeVolume(CoffeeVolume coffeeVolume) {
        this.coffeeVolume = coffeeVolume;
    }

    public String getCoffeeDrinkIngredients() {
        return """
            Ingredients:
            - 1/3 espresso coffee
            - 2/3 steamed milk
            """;
    }

    public void coffeeDrinkPrepare() {
        // some logic preparing latte
        this.lattePrepareStatus = String.format("Your %s. Enjoy :)", this.getCoffeeDrinkName());
    }

    public String getCoffeeDrinkName() {
        return "Latte";
    }

    public ICoffeeDrink getCoffeeDrink() {
        return this;
    }

    public void setCoffeeDrinkByDefault() {
        this.lattePrepareStatus = "Latte is not prepared yet.";
        this.coffeeFortress = CoffeeFortress.MEDIUM;
        this.coffeeVolume = CoffeeVolume.MEDIUM;
    }

    public String getCoffeeDrinkPrepareStatus() {
        return this.lattePrepareStatus;
    }

    public CoffeeVolume getCoffeeVolume() {
        return this.coffeeVolume;
    }

    public CoffeeFortress getCoffeeFortress() {
        return this.coffeeFortress;
    }
}
