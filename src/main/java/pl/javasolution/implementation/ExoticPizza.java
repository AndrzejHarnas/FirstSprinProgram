package pl.javasolution.implementation;

import pl.javasolution.api.IPizza;

public class ExoticPizza implements IPizza {

    private int price;
    private String name;


    public ExoticPizza(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}