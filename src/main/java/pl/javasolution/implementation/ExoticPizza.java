package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import pl.javasolution.api.GoodPizza;
import pl.javasolution.api.IPizza;

//@Primary
@Component
//@GoodPizza

public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    @Value("#{goodPizza.price matches '[1-9][1-9]'}")
        boolean bool;

    public ExoticPizza(
            @Value("#{T(java.lang.Math).random()*10}") int price,
            @Value("#{goodPizza.getName()?.toUpperCase()}") String name)
    {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {

        System.out.println(bool);
        return price;
    }

    public void setPrice(int price) {
    this.price = price;
    }

    public String getName() {
        return name;
    }
}
