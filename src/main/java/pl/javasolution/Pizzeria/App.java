package pl.javasolution.Pizzeria;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.api.IOrder;
import pl.javasolution.config.AutoConfigSpring;
import pl.javasolution.config.Config;
import pl.javasolution.implementation.Order;

public class App {
    public static void  main(String[] args){


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfigSpring.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
        IOrder order2 = context.getBean(Order.class);
        order2.printOrder();

    }
}
