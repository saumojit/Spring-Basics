package spring.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.three.config.AppConfig;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien al = context.getBean(Alien.class);
        System.out.println("age of alien - " + al.getAge());
        al.code();

    }
}
