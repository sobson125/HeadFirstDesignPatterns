package Factory.NonVege;

import Factory.Model.Pizza;
import Factory.Model.Pizzeria;

public class NonVegetarianPizzeria extends Pizzeria{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("grana padano")){
            pizza = new GranaPadanoPizza();
        } else if (type.equals("spinata picante")){
            pizza = new SpinataPicantePizza();
        }
        return pizza;
    }
}
