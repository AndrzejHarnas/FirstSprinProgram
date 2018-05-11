package pl.javasolution.Pizzeria;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.api.IOrder;
import pl.javasolution.config.AutoConfigSpring;
import pl.javasolution.config.Config;

public class App {
    public static void  main(String[] args){


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfigSpring.class);
        IOrder order = (IOrder) context.getBean("order");
        order.printOrder();
    }
}
