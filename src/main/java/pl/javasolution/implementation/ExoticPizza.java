package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import pl.javasolution.api.IPizza;

//@Primary
@Component
@Qualifier("egzotyczna")
public class ExoticPizza implements IPizza {

    private int price;
    private String name;


    public ExoticPizza(
            @Value("17") int price,
            @Value("Egzotyczna") String name)
    {
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
