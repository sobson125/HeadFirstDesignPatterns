package Decorator;

public class Chocolate implements IngredientDecorator {
    private Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double calculateCost() {
        return drink.calculateCost() + 0.20;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "Chocolate";
    }
}
