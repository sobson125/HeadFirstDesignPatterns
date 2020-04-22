package Decorator;

public class Espresso implements Drink {
    private String description;

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double calculateCost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
