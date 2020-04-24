package Factory.NonVege;

import Factory.Model.Pizza;

public class SpinataPicantePizza extends Pizza {
    public SpinataPicantePizza() {
        name = "Spinata Picante";
    }

    @Override
    public void packPizza() {
        System.out.println("Packing from spinata picante");
    }
}
