package Factory;

import Factory.Model.Pizza;
import Factory.Model.Pizzeria;
import Factory.NonVege.NonVegetarianPizzeria;
import Factory.Vege.VegetarianPizzeria;

public class PizzaTest {
    public static void main(String[] args) {
        Pizzeria pizzeria = new VegetarianPizzeria();
        Pizza pizza = pizzeria.orderPizza("vegies");
        System.out.println(pizza.getName());
        pizzeria = new NonVegetarianPizzeria();
        pizza = pizzeria.orderPizza("spinata picante");
        System.out.println(pizza.getName());
    }
}
