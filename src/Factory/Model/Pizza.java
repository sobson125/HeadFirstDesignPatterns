package Factory.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String pastry;
    protected String name;
    protected String Sauce;
    private List<String> additions = new ArrayList<>();
    public void packPizza() {
        System.out.println("Packing from default packPizza method in Pizza interface");
    }

    public String getName() {
        return name;
    }
}
