package spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {

        // < Context Setting , XML Config , Spring Objects Creation Scopes >
        // < Classes Involved => Alien , Laptop >
        System.out.println( "Hello World!" );


        // // object creation without spring
        // Alien al = new Alien();
        // al.code();

        // // object creation with spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien al = (Alien) context.getBean("alien");
        al.age=5;
        al.code();
        System.out.println(al.age);


        Alien al2 = (Alien) context.getBean("alien");
        al2.code();
        System.out.println(al2.age);
    }
}
