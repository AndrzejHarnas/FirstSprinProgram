package pl.javasolution.implementation;

import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza){
        super();
        this.pizza=pizza;
    }

    public void printOrder() {

  System.out.println("Zamówienie: " + pizza.getName()+ " cena: "+pizza.getPrice());

    }
}
