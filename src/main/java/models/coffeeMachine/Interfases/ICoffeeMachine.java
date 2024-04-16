package models.coffeeMachine.Interfases;

public interface ICoffeeMachine {
    void addCoffeeDrink(ICoffeeDrink coffeeDrink);
    String getCoffeeMachineMenu();
    String getCoffeeDrinkIngredients(int coffeeDrinkIndex);
    ICoffeeDrink makeCoffeeDrink(int coffeeDrinkIndex, int coffeeFortress, int coffeeVolume);
    int getCoffeeDrinksCount();
    String getCoffeeVolumeMenu();
    String getCoffeeFortressMenu();
}
