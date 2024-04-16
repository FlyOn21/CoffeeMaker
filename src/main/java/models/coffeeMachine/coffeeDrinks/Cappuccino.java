package models.coffeeMachine.coffeeDrinks;
import models.coffeeMachine.Interfases.ICoffeeDrink;
import models.coffeeMachine.enums.CoffeeFortress;
import models.coffeeMachine.enums.CoffeeVolume;

public class Cappuccino implements ICoffeeDrink {
    private String cappuccinoPrepareStatus;
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
            - 1/3 espresso coffee
            - 1/3 steamed milk
            - 1/3 milk foam
            """;
    }

    public void coffeeDrinkPrepare() {
        // some logic preparing cappuccino
        this.cappuccinoPrepareStatus = String.format("Your %s. Enjoy :)", this.getCoffeeDrinkName());
    }

    public String getCoffeeDrinkName() {
        return "Cappuccino";
    }

    public ICoffeeDrink getCoffeeDrink() {
        return this;
    }

    public void setCoffeeDrinkByDefault() {
        this.cappuccinoPrepareStatus = "Cappuccino is not prepared yet.";
        this.coffeeFortress = CoffeeFortress.MEDIUM;
        this.coffeeVolume = CoffeeVolume.MEDIUM;
    }

    public String getCoffeeDrinkPrepareStatus() {
        return this.cappuccinoPrepareStatus;
    }

    public CoffeeVolume getCoffeeVolume() {
        return this.coffeeVolume;
    }

    public CoffeeFortress getCoffeeFortress() {
        return this.coffeeFortress;
    }
}
