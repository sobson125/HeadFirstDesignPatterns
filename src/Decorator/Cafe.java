package Decorator;

public class Cafe {
    public static void main(String[] args) {

        Drink espresso = new Espresso();
        System.out.println(espresso.getDescription() + " " + espresso.calculateCost());
        Drink arabica = new Arabica();
        System.out.println(arabica.getDescription() + " " + arabica.calculateCost());
        arabica = new Chocolate(arabica);
        arabica = new Chocolate(arabica);
        System.out.println(String.format("%s cena: %.2f",arabica.getDescription(),arabica.calculateCost()));
    }
}
