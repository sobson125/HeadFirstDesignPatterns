package Factory.Vege;

import Factory.Model.Pizza;
import Factory.Model.Pizzeria;

public class VegetarianPizzeria extends Pizzeria {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("vegies")){
            pizza = new VegePizza();
        }
        return pizza;
    }
}
