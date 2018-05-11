package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Qualifier("egzotyczna") IPizza pizza){
        super();
        this.pizza=pizza;
    }

    public void printOrder() {

  System.out.println("Zamówienie: " + pizza.getName()+ " cena: "+pizza.getPrice());

    }
}
