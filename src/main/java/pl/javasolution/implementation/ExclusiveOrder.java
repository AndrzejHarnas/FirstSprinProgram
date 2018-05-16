package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.GoodPizza;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

 //   @Autowired
 //   @GoodPizza
    private IPizza pizza;

    public ExclusiveOrder(){
    super();

    }



    public void printOrder() {
        System.out.println("Zamówienie exclusive: " + pizza.getName() + " cena: " +pizza.getPrice());
    }


      @Autowired
      @GoodPizza

    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
