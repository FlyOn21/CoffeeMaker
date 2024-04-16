package models.coffeeMachine.Interfases;

import models.coffeeMachine.enums.CoffeeFortress;
import models.coffeeMachine.enums.CoffeeVolume;

public interface ICoffeeDrink {
    String getCoffeeDrinkIngredients();
    void coffeeDrinkPrepare();
    String getCoffeeDrinkName();
    ICoffeeDrink getCoffeeDrink();
    void setCoffeeFortress(CoffeeFortress coffeeFortress);
    void setCoffeeVolume(CoffeeVolume coffeeVolume);
    String getCoffeeDrinkPrepareStatus();
    CoffeeFortress getCoffeeFortress();
    CoffeeVolume getCoffeeVolume();
    void setCoffeeDrinkByDefault();
}
