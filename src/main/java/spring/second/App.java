package spring.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.second.config.AppConfig;


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
        al.code();


//        Example - Object creation with prototype
//        Desktop dt = context.getBean("desktop1" , Desktop.class);
//        dt.compile();
//
//        Desktop dt2 = context.getBean("desktop1" , Desktop.class);
//        dt2.compile();
    }
}
