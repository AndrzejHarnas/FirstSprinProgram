package pl.javasolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pl.javasolution.api.IPizza;
import pl.javasolution.implementation.ExoticPizza;
import pl.javasolution.implementation.GoodPizza;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("pl.javasolution.implementation")
//@Import(Config.class)
public class AutoConfigSpring {

    @Bean
    public List<IPizza> listOfPizza(){
     List<IPizza> listOfPizza = new ArrayList<IPizza>();
     listOfPizza.add(new ExoticPizza(15,"exotic"));
     listOfPizza.add(new GoodPizza(10,"good"));
     return listOfPizza;
    }


}
