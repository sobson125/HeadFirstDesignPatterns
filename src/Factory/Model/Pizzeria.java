package Factory.Model;

public abstract class Pizzeria {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.packPizza();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
