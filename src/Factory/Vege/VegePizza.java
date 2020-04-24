package Factory.Vege;

import Factory.Model.Pizza;

public class VegePizza extends Pizza {

    public VegePizza() {
        name = "Vege pizza";
    }

    @Override
    public void packPizza() {
        System.out.println("Packing from Vege Pizza");
    }
}
