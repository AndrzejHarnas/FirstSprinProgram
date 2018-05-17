package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Value("#{goodPizza}") IPizza pizza){
        super();
//        pizza.setPrice(10);
        this.pizza=pizza;
    }

    public void printOrder() {

  System.out.println("Zamówienie: " + pizza.getName()+ " cena: "+pizza.getPrice());

    }
}
