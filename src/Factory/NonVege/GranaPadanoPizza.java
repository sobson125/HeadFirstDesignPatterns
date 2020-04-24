package Factory.NonVege;

import Factory.Model.Pizza;

public class GranaPadanoPizza extends Pizza {

    public GranaPadanoPizza() {
        super.name = "Grana Padano";
    }

    @Override
    public void packPizza() {
        System.out.println("Packing from  GranaPadano Pizza");
    }
}
