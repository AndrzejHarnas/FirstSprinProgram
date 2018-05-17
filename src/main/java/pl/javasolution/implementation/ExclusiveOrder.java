package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.GoodPizza;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

 //   @Autowired
 //   @GoodPizza
@Value("#{listOfPizza[0]}")
    private IPizza pizza;


    @Autowired
    private List<IPizza> listOfPizza;
    public ExclusiveOrder(){
    super();

    }



    public void printOrder() {
        System.out.println("Zamówienie exclusive: " + pizza.getName() + " cena: " +pizza.getPrice());
    }


//      @Autowired
//      @Value("#{exoticPizza}")
//     @GoodPizza

    public void setPizza(IPizza pizza) {
//        pizza.setPrice(20);
        this.pizza = pizza;

    }
}
