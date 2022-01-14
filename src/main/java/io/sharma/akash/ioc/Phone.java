package io.sharma.akash.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("akash.xml");
        System.out.println("Container started");
        Sim sim = applicationContext.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
    }
}
