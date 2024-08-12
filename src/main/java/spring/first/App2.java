package spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        // < Setter Injection and Ref : Classes Bus & Engine >
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bus bus= (Bus) context.getBean("bus");
        System.out.println("BUS Mileage : " +bus.getMile());
        bus.drive();
        bus.setMile(150);
        System.out.println("BUS Mileage : " +bus.getMile());

        // < Constructor Injection and Ref : Classes Car>
        Car car = (Car) context.getBean("car");
        System.out.println("CAR Mileage : " + car.getMile());

    }
}
