package Decorator;

public class Arabica implements Drink {

    private String description;

    public Arabica() {
        description = "Arabica";
    }

    @Override
    public double calculateCost() {
        return 1.45;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
