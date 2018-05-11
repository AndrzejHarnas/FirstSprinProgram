package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IPizza;

//@Primary
@Component
@Qualifier("dobra")
public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(@Value("15") int price,@Value("Dobra") String name){
        super();
        this.price=price;
        this.name=name;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
